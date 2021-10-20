package zoo;

public abstract class AbstractFactory {

    public abstract Mammal createMammal(String mammalType, String name, float temperature, int numberOfLegs,
            String color);

    public abstract Bird createBird(String birdType, String name, float weight, float wingspan);

    public abstract Fish createFish(String fishType, String name, float length);
}
