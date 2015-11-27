package fr.istic.m2miage.dungeonassault;

import java.util.ArrayList;
import java.util.Collection;

import fr.istic.m2miage.dungeonassault.playerClass.Mage;
import fr.istic.m2miage.dungeonassault.playerClass.Priest;
import fr.istic.m2miage.dungeonassault.playerClass.Rogue;
import fr.istic.m2miage.dungeonassault.playerClass.Warrior;
import fr.istic.m2miage.dungeonassault.utility.*;
import fr.istic.m2miage.dungeonassault.utility.Character;

/**
 * Created by jeremy on 20/11/15.
 */
public abstract class Player extends LivingEntity implements Character {

    private int stamina;
    private int resilience;
    private int power;
    private String name;

    private Collection<Item> inventory;
    private Weapon weapon;
    private Armor armor;
    private int pseudo;

    private int level;
    private float exp;
    private int nextLevel;
    private String playerClass;
    private int gold;

    public Player(String playerClass, String name, int stamina, int resilience, int power, Armor armor, Weapon weapon) {
        //health
        super(100);

        this.name = name;
        this.playerClass = playerClass;
        this.stamina = stamina;
        this.resilience = resilience;
        this.power = power;
        this.inventory = new ArrayList<Item>();
        this.armor = armor;
        this.weapon = weapon;

        this.level = 1;
        this.exp = 100;
        this.nextLevel = Experience.ExpToNextLevel(2);
        this.gold = 666;
    }

    /**
     *
     * @param e
     */
    public void addXp(float e) {
        exp += e;
//      While exp >= nextLevel Then LevelUp
        while (exp >= nextLevel){
            levelUp();
        }
    }

    /**
     *
     */
    private void levelUp(){
//      Update Level
        level++;
//      Modify stats after level up
        upStatsAfterLevelUp();
        //calcul du nouveau palier pour le niveau suivant
        nextLevel = Experience.ExpToNextLevel(level);
    }

    /**
     *
     */
    private void upStatsAfterLevelUp() {
        this.stamina++;
        this.resilience++;
        this.power++;
    }

    /**
     *
     */
    public void move() {

    }

    /**
     *
     * @param i
     */
    public void use(Item i) {
        if(this.inventory.contains(i)) {
            i.use();
            this.inventory.remove(i);
        }
    }

    /**
     *
     * @param i
     */
    public void addItem(Item i) {
        this.inventory.add(i);
    }

    protected abstract void action1(Character c);
    protected abstract void action2(Character c);

    public static Player CreatePlayer(String pseudo, String playerClass) {

        switch (playerClass){
            case "Rogue": return new Rogue(pseudo);

            case "Warrior":return new Warrior(pseudo);

            case "Priest":return new Priest(pseudo);

            case "Mage":return new Mage(pseudo);

            default: return new Mage(pseudo);
        }
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public int getGold() {
        return gold;
    }

    public int getExpPourcentage() {
        return (int) (100 - ((exp / nextLevel)*100));
    }

    public float getExp() {
        return exp;
    }

    public float getNextLevel() {
        return nextLevel;
    }
}