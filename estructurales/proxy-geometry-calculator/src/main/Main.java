package main;

import geometrycalculator.Circle;
import geometrycalculator.GeometryCalculatorBeanFactory;
import geometrycalculator.IGeometryCalculatorBean;

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
         * Ejemplo de Design Patterns and Best Practices in Java:
         * A comprehensive guide to building smart and reusable code in Java
         */
        IGeometryCalculatorBean circle = GeometryCalculatorBeanFactory.REMOTE_PROXY.makeGeometryCalculator();
        System.out.printf("Circle diameter %fn\n", circle.calculateCircleCircumference(new Circle()));
    }

}
