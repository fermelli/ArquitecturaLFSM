package weapon;

public class LongSword implements IWeapon {

    @Override
    public String getName() {
        return "LongSword";
    }

    @Override
    public float getDamage() {
        return 10;
    }

    @Override
    public float getRange() {
        return 2;
    }

}
