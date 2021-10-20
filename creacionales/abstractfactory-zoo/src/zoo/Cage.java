package zoo;

public class Cage {

    private float width;
    private float height;
    private float length;
    private Animal animal;

    public Cage(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Cage(float length, float width, float height, Animal animal) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.animal = animal;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "{\n" + " Ancho='" + getWidth() + "'" + ", Alto='" + getHeight() + "'" + ", Largo='" + getLength() + "'"
                + ", Animal='" + getAnimal() + "'" + "\n}";
    }

}
