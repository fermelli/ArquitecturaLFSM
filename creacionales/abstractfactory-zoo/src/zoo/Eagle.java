package zoo;

public class Eagle extends Bird {

    public Eagle(String name, float weight, float wingspan) {
        super(name, weight, wingspan);
    }

    @Override
    void fly() {
        System.out.println("El aguila " + this.getName() + " esta volando");
    }

}
