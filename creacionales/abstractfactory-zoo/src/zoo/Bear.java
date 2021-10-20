package zoo;

public class Bear extends Mammal {

    public Bear(String name, float temperature, int numberOfLegs, String color) {
        super(name, temperature, numberOfLegs, color);
    }

    @Override
    float getTemperature() {
        return this.temperature;
    }

}
