package fr.istic.m2miage.dungeonassault.playerClass;

import fr.istic.m2miage.dungeonassault.*;
import fr.istic.m2miage.dungeonassault.utility.Armor;
import fr.istic.m2miage.dungeonassault.utility.Character;
import fr.istic.m2miage.dungeonassault.utility.Weapon;

/**
 * Created by jeremy on 20/11/15.
 */
public class Rogue extends Player {

    public Rogue(String n) {
        super("Rogue", n, 100, 70, 90, new Armor("Rogue Armor", 50), new Weapon("Rogue Weapon", 50));
    }

    @Override
    protected void action1(Character c) {

    }

    @Override
    protected void action2(Character c) {

    }
}