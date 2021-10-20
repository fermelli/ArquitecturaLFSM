package ejercicio3solid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fermelli
 */
public class BaseDeDatos {
    private final String host;
    private final int puerto;
    private final String usuario;
    private final String password;
    private final String baseDeDatos;
    Connection conexion;

    public BaseDeDatos(String host, int puerto, String usuario, String password, String baseDeDatos) {
        this.host = host;
        this.puerto = puerto;
        this.usuario = usuario;
        this.password = password;
        this.baseDeDatos = baseDeDatos;
        conectar();
    }
    
    public void conectar() {
        try {
            String url = String.format("jdbc:mysql://%s:%d/%s", host, puerto, baseDeDatos);
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public boolean existeUsuario(String nombre, String password) {
        PreparedStatement ps;
        boolean existe = false;
        try {
            ps = conexion.prepareStatement("SELECT * FROM usuarios WHERE nombre = ? AND password = SHA1(?) LIMIT 1");
            ps.setString(1, nombre);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            existe = rs.next();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return existe;
    }
}
