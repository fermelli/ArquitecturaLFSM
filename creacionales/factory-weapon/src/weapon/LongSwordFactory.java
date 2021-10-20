package weapon;

public class LongSwordFactory implements IWeaponFactory {

    @Override
    public IWeapon create() {
        return new LongSword();
    }

}