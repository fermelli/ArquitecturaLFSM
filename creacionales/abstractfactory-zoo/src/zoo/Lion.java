package zoo;

public class Lion extends Mammal {

    public Lion(String name, float temperature, int numberOfLegs, String color) {
        super(name, temperature, numberOfLegs, color);
    }

    @Override
    float getTemperature() {
        return this.temperature;
    }

}
