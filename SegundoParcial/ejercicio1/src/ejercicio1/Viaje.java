package ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fermelli
 */
public class Viaje implements IViaje {

    int id;
    String fecha;
    String hora;
    String origen;
    String destino;
    List<Pasajero> listaPasajeros;

    public Viaje(String fecha, String hora, String origen, String destino) {
        this.fecha = fecha;
        this.hora = hora;
        this.origen = origen;
        this.destino = destino;
        this.listaPasajeros = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<Pasajero> getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(List<Pasajero> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

    @Override
    public void addPasajero(Pasajero pasajero) {
        listaPasajeros.add(pasajero);
    }

    @Override
    public boolean removePasajero(String cedulaIdentidad) {
        Pasajero pasajeroBuscado = null;
        for (Pasajero pasajero : listaPasajeros) {
            if (pasajero.getCedulaIdentidad().equals(cedulaIdentidad)) {
                pasajeroBuscado = pasajero;
            }
        }
        return pasajeroBuscado != null;
    }

    @Override
    public String listarPasajeros() {
        String lista = "";
        if (listaPasajeros.isEmpty()) {
            return "No hay pasajeros registrados\n";
        }

        for (Pasajero pasajero : listaPasajeros) {
            lista += "\nCI: " + pasajero.getCedulaIdentidad()
                + "\nNombre: " + pasajero.getNombreCompleto()
                + "\nSexo: " + pasajero.getSexo().toString()
                + "\n";
        }
        return lista;
    }
}
