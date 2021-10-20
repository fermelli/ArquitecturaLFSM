package zoo;

public class Pacu extends Fish {

    public Pacu(String name, float length) {
        super(name, length);
    }

    @Override
    void swim() {
        System.out.println("El sabalo " + this.getName() + " esta nadando");
    }

}
