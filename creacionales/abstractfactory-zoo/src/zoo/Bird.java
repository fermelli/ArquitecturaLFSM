package zoo;

public abstract class Bird extends Animal {

    private float weight;
    private float wingspan;

    public Bird(String name, float weight, float wingspan) {
        super(name);
        this.weight = weight;
        this.wingspan = wingspan;
    }

    abstract void fly();

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWingspan() {
        return this.wingspan;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", weight='" + getWeight() + "'" + ", wingspan='" + getWingspan()
                + "'" + "}";
    }

}
