package ejercicio1;

/**
 *
 * @author fermelli
 */
public class Pasajero {

    int id;
    String cedulaIdentidad;
    String nombreCompleto;
    Sexo sexo;

    public Pasajero(String cedulaIdentidad, String nombreCompleto, Sexo sexo) {
        this.cedulaIdentidad = cedulaIdentidad;
        this.nombreCompleto = nombreCompleto;
        this.sexo = sexo;
    }

    public Pasajero(int id, String cedulaIdentidad, String nombreCompleto, Sexo sexo) {
        this.id = id;
        this.cedulaIdentidad = cedulaIdentidad;
        this.nombreCompleto = nombreCompleto;
        this.sexo = sexo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public void setCedulaIdentidad(String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
