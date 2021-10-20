package ejercicio2biblioteca;

/**
 *
 * @author fermelli
 */
public class Libro implements IPublicacion {

    private String titulo;
    private String anio;
    private String editorial;

    public Libro() {
    }

    public Libro(String titulo) {
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

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", anio=" + anio + ", editorial=" + editorial + '}';
    }

}
