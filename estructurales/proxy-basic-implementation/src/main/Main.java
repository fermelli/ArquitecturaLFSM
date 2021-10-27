package main;

import basicimplementation.Proxy;

/**
 *
 * @author fermelli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** 
         * Ejemplo de Java Design Patterns:
         * A Hands-On Experience with Real-World Examples, Second Edition
         */
        System.out.println("***Proxy Pattern Demo***\n");
        Proxy px = new Proxy();
        px.doSomeWork();
    }

}
