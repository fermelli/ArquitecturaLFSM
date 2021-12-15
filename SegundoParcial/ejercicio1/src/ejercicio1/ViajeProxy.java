package ejercicio1;

import database.Database;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fermelli
 */
public class ViajeProxy implements IViaje {

    String fecha;
    String hora;
    String origen;
    String destino;

    private Database database = new Database("localhost", "root", "", "com350_2do_parcial");
    private Viaje viaje;
    private List<String> listaAcciones = new ArrayList<>();

    public ViajeProxy(String fecha, String hora, String origen, String destino) {
        viaje = new Viaje(fecha, hora, origen, destino);
        int idViaje = database.guardarViaje(viaje);
        if (idViaje != -1) {
            viaje.setId(idViaje);
            listaAcciones.add("Se guardo el viaje en la base de datos");
        }
    }

    @Override
    public void addPasajero(Pasajero pasajero) {
        if (database.guardarPasajero(viaje, pasajero)) {
            listaAcciones.add("Se guardo el pasajero en la base de datos");
            viaje.addPasajero(pasajero);
        }
    }

    @Override
    public boolean removePasajero(String cedulaIdentidad) {
        boolean seElimino = database.eliminarPasajero(viaje, cedulaIdentidad);
        if (seElimino) {
            listaAcciones.add("Se elimino el pasajero en la base de datos");
            return viaje.removePasajero(cedulaIdentidad);
        }
        return seElimino;
    }

    @Override
    public String listarPasajeros() {
        List<Pasajero> listaPasajeros = database.obtenerPasajeros(viaje.getId());
        viaje.setListaPasajeros(listaPasajeros);
        listaAcciones.add("Se consulta los pasajeros de la base de datos");
        return viaje.listarPasajeros();
    }
    
    public String listarAccionesToString() {
        listaAcciones.add("Se realiza el listado de acciones");
        String lista = "";
        if (listaAcciones.isEmpty()) {
            return "No hay acciones registradas\n";
        }
        int contador = 1;
        for (String accion : listaAcciones) {
            lista += contador + ". " + accion + "\n";
            contador ++;
        }
        return lista + "\n";
    }

}
