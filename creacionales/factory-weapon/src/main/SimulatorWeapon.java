package main;

import java.util.List;

import weapon.IWeaponFactory;
import weapon.LongBowFactory;
import weapon.LongSwordFactory;

public class SimulatorWeapon {

    public static void main(String[] args) {

        LongSwordFactory longSwordFactory = new LongSwordFactory();
        LongBowFactory longBowFactory = new LongBowFactory();

        List<IWeaponFactory> factories = List.of(longBowFactory, longSwordFactory, longBowFactory);

        for (IWeaponFactory factory : factories) {
            System.out.println(factory.create().toString());
        }

    }
}
