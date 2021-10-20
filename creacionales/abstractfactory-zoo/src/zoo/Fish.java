package zoo;

public abstract class Fish extends Animal {

    private float length;

    public Fish(String name, float length) {
        super(name);
        this.length = length;
    }

    abstract void swim();

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", length='" + getLength() + "'" + "}";
    }

}
