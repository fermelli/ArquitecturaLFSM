package ejercicio1;

/**
 *
 * @author fermelli
 */
public interface IViaje {

    public void addPasajero(Pasajero pasajero);

    public boolean removePasajero(String cedulaIdentidad);

    public String listarPasajeros();
}
