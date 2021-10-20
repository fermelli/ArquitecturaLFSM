package weapon;

public class LongBowFactory implements IWeaponFactory {

    @Override
    public IWeapon create() {
        return new LongBow();
    }

}
