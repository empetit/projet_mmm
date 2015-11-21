package fr.istic.m2miage.dungeonassault.classes;

import fr.istic.m2miage.dungeonassault.*;
import fr.istic.m2miage.dungeonassault.utility.Armor;
import fr.istic.m2miage.dungeonassault.utility.Character;
import fr.istic.m2miage.dungeonassault.utility.Weapon;

/**
 * Created by jeremy on 20/11/15.
 */
public class Mage extends Player {

    public Mage(String n) {
        super("Mage", n, 100, 70, 90, new Armor("Mage Armor", 50), new Weapon("Mage Weapon", 50));
    }


    @Override
    protected void action1(Character c) {

    }

    @Override
    protected void action2(Character c) {

    }
}