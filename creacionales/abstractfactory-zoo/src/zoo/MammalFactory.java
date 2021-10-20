package zoo;

public class MammalFactory extends AbstractFactory {

    @Override
    public Mammal createMammal(String mammalType, String name, float temperature, int numberOfLegs, String color) {
        if (mammalType == null) {
            return null;
        }

        if (mammalType == "Lion") {
            return new Lion(name, temperature, numberOfLegs, color);
        } else if (mammalType == "Bear") {
            return new Bear(name, temperature, numberOfLegs, color);
        } else if (mammalType == "Monkey") {
            return new Monkey(name, temperature, numberOfLegs, color);
        }

        return null;
    }

    @Override
    public Bird createBird(String birdType, String name, float weight, float wingspan) {
        return null;
    }

    @Override
    public Fish createFish(String fishType, String name, float length) {
        return null;
    }

}
