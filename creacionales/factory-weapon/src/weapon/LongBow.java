package weapon;

public class LongBow implements IWeapon {

    @Override
    public String getName() {
        return "LongBow";
    }

    @Override
    public float getDamage() {
        return 8;
    }

    @Override
    public float getRange() {
        return 16;
    }

}