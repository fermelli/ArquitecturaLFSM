package ejercicio3solid;

/**
 *
 * @author fermelli
 */
public class ManejoCorreo {
    
    public static void enviarCorreo(Correo correo) {
        System.out.print(String.format(
            "ENVIANDO....\n"
                + "destinatario: %s\n"
                + "remitente: %s\n"
                + "asunto: %s\n"
                + "contenido:\n"
                + "%s\n",
            correo.getDestinatario(),
            correo.getRemitente(),
            correo.getAsunto(),
            correo.getContenido()
        ));
    }
}
