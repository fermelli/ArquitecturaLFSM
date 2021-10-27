package petshop;

import java.util.Calendar;

/**
 *
 * @author fermelli
 */
public class Dog implements IAnimalFeeder {

    private String petName;

    public Dog(String petName) throws Exception {
        if (petName.length() > 10) {
            throw new Exception("Name too long.");
        }
        this.petName = petName;
    }

    public String dropFood(int hungerLevel, boolean water) {
        return selectFood(hungerLevel) + (water ? " with water" : "");
    }

    public String displayFood(int hungerLevel) {
        return selectFood(hungerLevel);
    }

    protected String selectFood(int hungerLevel) {
        Calendar rightNow = Calendar.getInstance();
        if (hungerLevel == 3) {
            return "chicken and vegetables";
        } else if (rightNow.get(Calendar.HOUR_OF_DAY) < 10) {
            return "turkey and beef";
        } else {
            return "chicken and rice";
        }
    }

}
