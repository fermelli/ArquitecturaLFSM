package pilalog;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author fermelli
 */
public class ProxyPila implements IPila {

    private final IPila pila;
    private Logger logger;
    private String pathLog;

    public ProxyPila(int capacidad) {
        this.pila = new Pila(capacidad);
        initLog();
    }

    private void initLog() {
        logger = Logger.getLogger("miLog");
        pathLog = "./MiLog.log";
        try {
            FileHandler fhandler = new FileHandler(pathLog);
            logger.addHandler(fhandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fhandler.setFormatter(formatter);
        } catch (IOException | SecurityException ex) {
            System.out.println(ex);
        }
    }

    public Logger getLog() {
        return logger;
    }

    @Override
    public boolean insertar(Object object) {
        if (object != null) {
            logger.info("Se insertó un elemento en la pila");
            return pila.insertar(object);
        }
        logger.info("No se pudo insertar un elemento en la pila");
        return false;
    }

    @Override
    public Object eliminar() {
        Object elementoEliminado = pila.eliminar();
        if (elementoEliminado != null) {
            logger.info("Se eliminó un elemento de la pila");
            return elementoEliminado;
        }
        logger.info("No se pudo insertar un elemento en la pila");
        return null;
    }

    @Override
    public void mostrar() {
        logger.info("Se mostró los elmentos de la pila");
        pila.mostrar();
    }

}
