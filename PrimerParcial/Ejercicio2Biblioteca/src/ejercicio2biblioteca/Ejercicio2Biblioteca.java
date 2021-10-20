package ejercicio2biblioteca;

import java.util.Scanner;

/**
 *
 * @author fermelli
 */
public class Ejercicio2Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = Biblioteca.getInstancia();
        String opcion = "";
        do {
            System.out.println("--- MENÚ ---");
            System.out.println("\t\t1. Insertar publicación");
            System.out.println("\t\t2. Mostrar publicaciones");
            System.out.println("\t\t3. Mostrar datos biblioteca");
            System.out.println("\t\t4. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = scanner.nextLine();

            if (!("1".equals(opcion) || "2".equals(opcion) || "3".equals(opcion) || "4".equals(opcion))) {
                System.out.println("La opción no es válida");
            } else {
                switch (opcion) {
                    case "1":
                        String opcionPublicacion = "";
                        do {
                            System.out.println("\t\t\t--- INSERTAR PUBLICACIÓN ---");
                            System.out.println("\t\t\t\t1. Insertar libro");
                            System.out.println("\t\t\t\t2. Insertar periodico");
                            System.out.println("\t\t\t\t3. Insertar revista");
                            System.out.println("\t\t\t\t4. Salir");
                            System.out.print("\t\t\tIntroduzca una opción: ");
                            opcionPublicacion = scanner.nextLine();
                            if (!("1".equals(opcionPublicacion) || "2".equals(opcionPublicacion) || "3".equals(opcionPublicacion) || "4".equals(opcionPublicacion))) {
                                System.out.println("La opción de publicación no es válida");
                            } else {
                                PublicacionFactory fabrica = new PublicacionFactory();
                                String titulo;
                                String anio;
                                switch (opcionPublicacion) {
                                    case "1":
                                        System.out.println("\t\t\t--- DATOS LIBRO ---");
                                        System.out.print("\t\t\t\tTitulo: ");
                                        titulo = scanner.nextLine();
                                        System.out.print("\t\t\t\tEditorial: ");
                                        String editorial = scanner.nextLine();
                                        System.out.print("\t\t\t\tAño: ");
                                        anio = scanner.nextLine();
                                        Libro libro = (Libro) fabrica.getPublicacion("Libro", titulo);
                                        libro.setEditorial(editorial);
                                        libro.setAnio(anio);
                                        biblioteca.addPublicacion(libro);
                                        break;
                                    case "2":
                                        System.out.println("\t\t\t--- DATOS PERIODICO ---");
                                        System.out.print("\t\t\t\tTitulo: ");
                                        titulo = scanner.nextLine();
                                        System.out.print("\t\t\t\tAño: ");
                                        String fecha = scanner.nextLine();
                                        Periodico periodico = (Periodico) fabrica.getPublicacion("Periodico", titulo);
                                        periodico.setFecha(fecha);
                                        biblioteca.addPublicacion(periodico);
                                        break;
                                    case "3":
                                        System.out.println("\t\t\t--- DATOS REVISTA ---");
                                        System.out.print("\t\t\t\tTitulo: ");
                                        titulo = scanner.nextLine();
                                        System.out.print("\t\t\t\tAño: ");
                                        anio = scanner.nextLine();
                                        System.out.print("\t\t\t\tMes: ");
                                        String mes = scanner.nextLine();
                                        Revista revista = (Revista) fabrica.getPublicacion("Revista", titulo);
                                        revista.setAnio(anio);
                                        revista.setMes(mes);
                                        biblioteca.addPublicacion(revista);
                                        break;
                                    case "4":
                                        System.out.println("Saliendo de insertar publicación...");
                                        break;
                                    default:
                                        System.out.println("Opción no valida");
                                }
                            }
                        } while (!"4".equals(opcionPublicacion));
                        break;
                    case "2":
                        System.out.println("\t\t\t--- MOSTRAR PUBLICACIONES ---");
                        if (biblioteca.getPublicaciones().size() > 0) {
                            for (IPublicacion publicacion : biblioteca.getPublicaciones()) {
                                System.out.println(publicacion.toString());
                            }
                        } else {
                            System.out.println("\t\t\t\tNo hay publicaciones que mostrar");
                        }
                        break;
                    case "3":
                        System.out.println("\t\t\t--- MOSTRAR DATOS BIBLIOTECA ---");
                        System.out.println("\t\t\t\t" + biblioteca.toString());
                        break;
                    case "4":
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
            }
        } while (!"4".equals(opcion));
    }

}
