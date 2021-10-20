package zoo;

public class Parrot extends Bird {

    public Parrot(String name, float weight, float wingspan) {
        super(name, weight, wingspan);
    }

    @Override
    void fly() {
        System.out.println("El loro " + this.getName() + " esta volando");
    }

}
