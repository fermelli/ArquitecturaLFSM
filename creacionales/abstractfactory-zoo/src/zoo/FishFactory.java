package zoo;

public class FishFactory extends AbstractFactory {

    @Override
    public Mammal createMammal(String mammalType, String name, float temperature, int numberOfLegs, String color) {
        return null;
    }

    @Override
    public Bird createBird(String birdType, String name, float weight, float wingspan) {
        return null;
    }

    @Override
    public Fish createFish(String fishType, String name, float length) {
        if (fishType == null) {
            return null;
        }

        if (fishType == "Shad") {
            return new Shad(name, length);
        } else if (fishType == "Pacu") {
            return new Pacu(name, length);
        }

        return null;
    }

}
