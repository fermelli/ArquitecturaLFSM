package ejercicio2biblioteca;

/**
 *
 * @author fermelli
 */
public class Revista implements IPublicacion {

    private String titulo;
    private String anio;
    private String mes;

    public Revista() {
    }

    public Revista(String titulo) {
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

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Revista{" + "titulo=" + titulo + ", anio=" + anio + ", mes=" + mes + '}';
    }

}
