package zoo;

public class BirdFactory extends AbstractFactory {

    @Override
    public Mammal createMammal(String mammalType, String name, float temperature, int numberOfLegs, String color) {
        return null;
    }

    @Override
    public Bird createBird(String birdType, String name, float weight, float wingspan) {
        if (birdType == null) {
            return null;
        }

        if (birdType == "Parrot") {
            return new Parrot(name, weight, wingspan);
        } else if (birdType == "Eagle") {
            return new Eagle(name, weight, wingspan);
        } else if (birdType == "Condor") {
            return new Condor(name, weight, wingspan);
        }

        return null;
    }

    @Override
    public Fish createFish(String fishType, String name, float length) {
        return null;
    }

}
