package pilalog;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fermelli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- INICIALIZAR PILA ---");
        System.out.print("Introduzca la capacidad: ");
        int capacidad = Integer.parseInt(scanner.nextLine());
        ProxyPila proxyPila = new ProxyPila(capacidad);
        String opcion;
        do {
            System.out.println("--- MENÚ ---");
            System.out.println("\t1. Insertar");
            System.out.println("\t2. Eliminar");
            System.out.println("\t3. Mostrar");
            System.out.println("\t4. Mostrar Log");
            System.out.println("\t5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    Random random = new Random();
                    String elemento = "elemento: " + random.nextInt();
                    if (proxyPila.insertar(elemento)) {
                        System.out.println("Elemento insertado");
                    } else {
                        System.out.println("Elemento no se pudo insertar");
                    }
                    break;
                case "2":
                    Object elementoEliminado = proxyPila.eliminar();
                    if (elementoEliminado != null) {
                        System.out.println("Elemento: " + elementoEliminado.toString() + " eliminado");
                    } else {
                        System.out.println("No se pudo eliminar un elemento");
                    }
                    break;
                case "3":
                    System.out.println("Elementos de la pila");
                    proxyPila.mostrar();
                    break;
                case "4":
                    try {
                        FileInputStream fstream = new FileInputStream("./MiLog.log");
                        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
                        String strLine;
                        while ((strLine = br.readLine()) != null) {
                            System.out.println(strLine);
                        }
                        fstream.close();
                    } catch (IOException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");

            }
        } while (!("5".equals(opcion)));
    }

}
