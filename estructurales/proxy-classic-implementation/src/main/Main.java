package main;

import classicimplementation.ProxyTextStore;

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
         * Ejemplo de TypeScript 4 Design Patterns and Best Practices: 
         * Discover effective techniques and design patterns for every programming task
         */
        ProxyTextStore proxyTextStore = new ProxyTextStore();
        proxyTextStore.save("[id: 123, name: 'Luis', age: 29]");
    }
    
}
