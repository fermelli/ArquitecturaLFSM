package zoo;

public class Condor extends Bird {

    public Condor(String name, float weight, float wingspan) {
        super(name, weight, wingspan);
    }

    @Override
    void fly() {
        System.out.println("El condor " + this.getName() + " esta volando");
    }

}
