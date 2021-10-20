package ejercicio3solid;

import java.util.Scanner;

/**
 *
 * @author fermelli
 */
public class Ejercicio3Solid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseDeDatos bd = new BaseDeDatos("localhost", 3306, "root", "", "bd_primer_parcial_com350");
        bd.conectar();

        System.out.println("--- CREDENCIALES DE USUARIO ---");
        System.out.print("Nombre de usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (bd.existeUsuario(nombre, password)) {
            System.out.println("Autenticado");
            System.out.println("--- LLENANDO CORREO ---");
            System.out.print("Destinatario (email): ");
            String email = scanner.nextLine();
            System.out.print("Asunto: ");
            String asunto = scanner.nextLine();
            System.out.print("Contenido: ");
            String contenido = scanner.nextLine();
            Correo correo = new Correo(email, nombre, asunto, contenido);
            ManejoCorreo.enviarCorreo(correo);
        } else {
            System.out.println("Error: usuario o contraseña incorrecta");
        }
    }

}
