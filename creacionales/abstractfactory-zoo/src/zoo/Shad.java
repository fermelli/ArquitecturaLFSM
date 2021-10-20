package zoo;

public class Shad extends Fish {

    public Shad(String name, float length) {
        super(name, length);
    }

    @Override
    void swim() {
        System.out.println("El sabalo " + this.getName() + " esta nadando");
    }

}
