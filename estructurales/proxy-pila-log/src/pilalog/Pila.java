package pilalog;

/**
 *
 * @author fermelli
 */
public class Pila implements IPila {

    private int tope;
    private final int capacidad;
    private final Object elementos[];

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        elementos = new Object[capacidad];
        this.tope = -1;
    }

    public int tamanio() {
        return tope + 1;
    }

    public boolean estaVacia() {
        return tope < 0;
    }

    @Override
    public boolean insertar(Object object) {
        if (tamanio() < capacidad) {
            tope ++;
            elementos[tope] = object;
            return true;
        }

        return false;
    }

    @Override
    public Object eliminar() {
        Object elementoEliminado;

        if (estaVacia()) {
            return null;
        }

        elementoEliminado = elementos[tope];
        elementos[tope] = null;
        tope --;
        return elementoEliminado;
    }

    @Override
    public void mostrar() {
        if (!estaVacia()) {
            for (Object elemento : elementos) {
                System.out.println(elemento);
            }
        }
    }
}
