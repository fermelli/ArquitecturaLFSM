package main;

import vehicle.Car;
import vehicle.Director;
import vehicle.IBuilder;
import vehicle.MotorCycle;
import vehicle.Product;

/**
 *
 * @author fermelli
 */
public class BuilderPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***");
        Director director = new Director();
        IBuilder fordCar = new Car("Ford");
        IBuilder hondaMotorycle = new MotorCycle("Honda");
        // Making Car
        director.construct(fordCar);
        Product p1 = fordCar.getVehicle();
        p1.showProduct();
        //Making MotorCycle
        director.construct(hondaMotorycle);
        Product p2 = hondaMotorycle.getVehicle();
        p2.showProduct();
    }

}
