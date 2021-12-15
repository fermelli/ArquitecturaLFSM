package database;

import ejercicio1.Pasajero;
import ejercicio1.Sexo;
import ejercicio1.Viaje;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fermelli
 */
public class Database {

    String database;
    String hostname;
    String username;
    String password;
    Connection conexion = null;

    public Database(String hostname, String username, String password, String database) {
        this.hostname = hostname;
        this.username = username;
        this.password = password;
        this.database = database;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public void conectar() {
        try {
            String jdbc = String.format("jdbc:mysql://%s/%s?user=%s&password=%s", getHostname(), getDatabase(), getUsername(), getPassword());
            setConexion(DriverManager.getConnection(jdbc));
        } catch (SQLException ex) {
            System.out.println("Error al establecer conexión: " + ex);
        }
    }

    public void desconectar() {
        try {
            conectar();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar conexión: " + ex);
        }
    }

    public int guardarViaje(Viaje viaje) {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conectar();
            stmt = conexion.createStatement();
            String query = String.format("INSERT INTO viajes (fecha, hora, origen, destino) VALUES ('%s', '%s', '%s', '%s');",
                viaje.getFecha(), viaje.getHora(), viaje.getOrigen(), viaje.getDestino());
            int res = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            int idViaje = -1;
            if (rs.next()) {
                idViaje = rs.getInt(1);
            }
            rs.close();
            return idViaje;
        } catch (SQLException ex) {
            System.out.println("Error al guardar viaje: " + ex);
            return -1;
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            desconectar();
        }
    }

    public List<Pasajero> obtenerPasajeros(int idViaje) {
        ResultSet rs = null;
        Statement stmt = null;
        List<Pasajero> pasajeros = new ArrayList<>();
        try {
            conectar();
            String query = String.format("SELECT p.id, p.cedula_identidad, p.nombre_completo, p.sexo FROM viaje_pasajero AS vp LEFT JOIN pasajeros AS p ON vp.id_pasajero = p.id WHERE vp.id_viaje = %d;", idViaje);
            stmt = conexion.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                Pasajero pasajero = new Pasajero(rs.getInt("id"), rs.getString("cedula_identidad"), rs.getString("nombre_completo"), Sexo.valueOf(rs.getString("sexo")));
                pasajeros.add(pasajero);
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta: " + ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }

                stmt = null;
            }
            desconectar();
        }
        return pasajeros;
    }

    public boolean guardarPasajero(Viaje viaje, Pasajero pasajero) {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conectar();
            stmt = conexion.createStatement();
            String query1 = String.format("INSERT INTO pasajeros (cedula_identidad, nombre_completo, sexo) VALUES ('%s', '%s', '%s');", pasajero.getCedulaIdentidad(), pasajero.getNombreCompleto(), pasajero.getSexo().toString());
            stmt.executeUpdate(query1, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            int idPasajero = -1;
            if (rs.next()) {
                idPasajero = rs.getInt(1);
            }
            rs.close();
            String query2 = String.format("INSERT INTO viaje_pasajero (id_viaje, id_pasajero) VALUES (%d, %d);", viaje.getId(), idPasajero);
            return stmt.execute(query2);
        } catch (SQLException ex) {
            System.out.println("Error al guardar pasajero: " + ex);
            return false;
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            desconectar();
        }
    }

    public int obtenerIdPasajero(String cedulaIdentidad) {
        ResultSet rs = null;
        Statement stmt = null;
        int id = -1;
        try {
            conectar();
            String query = String.format("SELECT id FROM pasajeros WHERE LOWER(cedula_identidad) = LOWER('%s');", cedulaIdentidad);
            stmt = conexion.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta: " + ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }

                stmt = null;
            }
            desconectar();
        }
        return id;
    }

    public boolean eliminarPasajero(Viaje viaje, String cedulaIdentidad) {
        int idPasajero = obtenerIdPasajero(cedulaIdentidad);
        Statement stmt = null;
        try {
            conectar();
            stmt = conexion.createStatement();
            String query = String.format("DELETE FROM viaje_pasajero WHERE id_viaje = %d AND id_pasajero = %d;", viaje.getId(), idPasajero);
            return stmt.execute(query);
        } catch (SQLException ex) {
            System.out.println("Error al eliminar pasajero: " + ex);
            return false;
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            desconectar();
        }
    }
}
