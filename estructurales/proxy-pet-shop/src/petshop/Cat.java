package petshop;

/**
 *
 * @author fermelli
 */
public class Cat implements IAnimalFeeder {

    private String petName;

    public Cat(String petName) {
        this.petName = petName;
    }

    @Override
    public String dropFood(int hungerLevel, boolean water) {
        return selectFood(hungerLevel) + (water ? " with water" : "");
    }

    @Override
    public String displayFood(int hungerLevel) {
        return selectFood(hungerLevel);
    }

    protected String selectFood(int hungerLevel) {
        switch (hungerLevel) {
            case 0:
                return "lamb";
            case 1:
                return "chicken";
            case 3:
                return "tuna";
        }
        
        return "";
    }

}
