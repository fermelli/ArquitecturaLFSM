package zoo;

public class FactoryCreator {
    public static AbstractFactory geFactory(String choice) {

        if (choice == "Mammal") {
            return new MammalFactory();
        } else if (choice == "Bird") {
            return new BirdFactory();
        } else if (choice == "Fish") {
            return new FishFactory();
        }

        return null;
    }
}
