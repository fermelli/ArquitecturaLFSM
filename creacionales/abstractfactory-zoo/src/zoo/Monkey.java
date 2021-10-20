package zoo;

public class Monkey extends Mammal {

    public Monkey(String name, float temperature, int numberOfLegs, String color) {
        super(name, temperature, numberOfLegs, color);
    }

    @Override
    float getTemperature() {
        return this.temperature;
    }

}
