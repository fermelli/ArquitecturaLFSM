package ejercicio2biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fermelli
 */
public class Biblioteca {

    private static Biblioteca instancia;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<IPublicacion> publicaciones = new ArrayList<>();

    public Biblioteca() {
        this.nombre = "Biblioteca Tecnología";
        this.direccion = "Regimiento Campos 6 de Infanteria, Sucre";
        this.telefono = "46456515";
    }

    public static Biblioteca getInstancia() {
        if (instancia == null) {
            return new Biblioteca();
        }

        return instancia;
    }

    public void addPublicacion(IPublicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<IPublicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<IPublicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    @Override
    public String toString() {
        return "Biblioteca {" + "\nnombre: " + nombre + ", \ndireccion=" + direccion + ", \ntelefono=" + telefono + ", \npublicaciones=" + publicaciones + "\n}";
    }

}
