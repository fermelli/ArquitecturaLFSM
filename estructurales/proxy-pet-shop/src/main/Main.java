package main;

import petshop.AnimalFeederProxy;

/**
 *
 * @author fermelli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        /**
         * Ejemplo de
         */
        AnimalFeederProxy felix = new AnimalFeederProxy("Cat", "felix");
        System.out.println(felix.displayFood(1));
        System.out.println(felix.dropFood(1, true));
        
        AnimalFeederProxy brian = new AnimalFeederProxy("Dog", "Brian");
        System.out.println(brian.displayFood(1));
        System.out.println(brian.dropFood(1, true));

    }

}
