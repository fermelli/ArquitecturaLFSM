package ejercicio2biblioteca;

/**
 *
 * @author fermelli
 */
public class Periodico implements IPublicacion {

    private String titulo;
    private String fecha;

    public Periodico() {
    }

    public Periodico(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Periodico{" + "titulo=" + titulo + ", fecha=" + fecha + '}';
    }
    
}
