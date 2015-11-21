package fr.istic.m2miage.dungeonassault;

import java.util.ArrayList;
import java.util.Collection;

import fr.istic.m2miage.dungeonassault.classes.Mage;
import fr.istic.m2miage.dungeonassault.classes.Priest;
import fr.istic.m2miage.dungeonassault.classes.Rogue;
import fr.istic.m2miage.dungeonassault.classes.Warrior;
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
    private String classe;
    private int gold;

    public Player(String classe, String name, int stamina, int resilience, int power, Armor armor, Weapon weapon) {
        //health
        super(100);

        this.name = name;
        this.classe = classe;
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

    public void gainExp( float e ){
        exp += exp;

        //gain de niveau ?
        if (exp >= nextLevel){
            levelup();
        }
    }

    public void levelup(){
        //augmente le niveau
        level++;

        //TODO : modifier les stats

        //calcul du nouveau palier pour le niveau suivant
        nextLevel = Experience.ExpToNextLevel(level);
    }

    public void move() {

    }

    public void use(Item i) {
        if(this.inventory.contains(i)) {
            i.use();
            this.inventory.remove(i);
        }
    }

    public void addItem(Item i) {
        this.inventory.add(i);
    }

    protected abstract void action1(Character c);
    protected abstract void action2(Character c);

    public static Player CreatePlayer(String pseudo, String classe) {

        switch (classe){
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

    public String getClasse() {
        return classe;
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