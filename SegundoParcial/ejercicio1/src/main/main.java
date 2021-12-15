package main;

import ejercicio1.IViaje;
import ejercicio1.Pasajero;
import ejercicio1.Sexo;
import ejercicio1.ViajeProxy;
import java.util.Scanner;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- DATOS DEL VIAJE ---");
        System.out.print("\tFecha: ");
        String fecha = scanner.nextLine();
        System.out.print("\tHora: ");
        String hora = scanner.nextLine();
        System.out.print("\tOrigen: ");
        String origen = scanner.nextLine();
        System.out.print("\tDestino: ");
        String destino = scanner.nextLine();

        IViaje viaje = new ViajeProxy(fecha, hora, origen, destino);
        String opcion = "5";
        do {
            System.out.println("\t\t--- MENU ---");
            System.out.println("1. Añadir pasajero");
            System.out.println("2. Eliminar pasajero");
            System.out.println("3. Mostrar pasajeros");
            System.out.println("4. Mostrar lista de acciones realizadas");
            System.out.println("5. Salir ");
            opcion = scanner.nextLine();
            String ci;
            switch (opcion) {
                case "1":
                    System.out.println("--- DATOS DEL PASAJERO ---");
                    System.out.print("\tCarnet de Identidad: ");
                    ci = scanner.nextLine();
                    System.out.print("\tNombre Completo: ");
                    String nombreCompleto = scanner.nextLine();
                    System.out.print("\tSexo: ");
                    String sexo = scanner.nextLine();
                    viaje.addPasajero(new Pasajero(ci, nombreCompleto, Sexo.valueOf(sexo)));
                    break;
                case "2":
                    System.out.println("--- ELIMINAR PASAJERO ---");
                    System.out.print("\tCarned de Identidad: ");
                    ci = scanner.nextLine();
                    viaje.removePasajero(ci);
                    break;
                case "3":
                    System.out.println("--- MOSTRAR PASAJEROS ---");
                    System.out.print(viaje.listarPasajeros());
                    break;
                case "4":
                    System.out.println("--- MOSTRAR ACCIONES REALIZADAS ---");
                    ViajeProxy viajeProxy = (ViajeProxy) viaje;
                    System.out.print(viajeProxy.listarAccionesToString());
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        } while (!"5".equals(opcion));
    }

}
