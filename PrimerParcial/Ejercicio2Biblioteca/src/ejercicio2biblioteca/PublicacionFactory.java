package ejercicio2biblioteca;

/**
 *
 * @author fermelli
 */
public class PublicacionFactory {

    public IPublicacion getPublicacion(String tipo, String titulo) {
        switch(tipo) {
            case "Libro": 
                return new Libro(titulo);
            case "Revista":
                return new Revista(titulo);
            case "Periodico":
                return new Periodico(titulo);
            default:
                return null;
        }
    }
}
