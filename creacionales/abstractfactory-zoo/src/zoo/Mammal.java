package zoo;

public abstract class Mammal extends Animal {

    float temperature;
    private int numberOfLegs;
    private String color;

    public Mammal(String name, float temperature, int numberOfLegs, String color) {
        super(name);
        this.temperature = temperature;
        this.numberOfLegs = numberOfLegs;
        this.color = color;
    }

    abstract float getTemperature();

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", temperature='" + getTemperature() + "'" + ", numberOfLegs='"
                + getNumberOfLegs() + "'" + ", color='" + getColor() + "'" + "}";
    }

}
