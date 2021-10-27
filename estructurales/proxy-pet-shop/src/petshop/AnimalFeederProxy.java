package petshop;

/**
 *
 * @author fermelli
 */
public class AnimalFeederProxy implements IAnimalFeeder{
    
    protected IAnimalFeeder animalFeeder;

    public AnimalFeederProxy(String feeder, String name) throws Exception {
        if("Cat".equals(feeder)) {
            animalFeeder = new Cat(name);
        }
        
        if("Dog".equals(feeder)) {
            animalFeeder = new Dog(name);
        }
    }
    
    public String dropFood(int hungerLevel, boolean water) {
        return animalFeeder.dropFood(hungerLevel, water);
    }

    public String displayFood(int hungerLevel) {
        return animalFeeder.displayFood(hungerLevel);
    }
    
}
