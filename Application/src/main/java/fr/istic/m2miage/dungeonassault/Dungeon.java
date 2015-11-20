package fr.istic.m2miage.dungeonassault;

import java.util.Enumeration;

/**
 * Created by epeti on 20/11/2015.
 */
public class Dungeon {
    private String name;
    private String[] map;
    private int level;
    private static String[] ListeSalles = {"Vide", "Monstre", "Tresor", "PNJ"};;

    public Dungeon(int lvl, int nbSalles) {

        this.level = lvl;

        this.name = nameGenerator();

        this.map = mapGenerator(nbSalles);

    }

    private String[] mapGenerator( int nbSalles ) {
        String[] m = new String[nbSalles];

        for (int i = 0 ; i < ListeSalles.length ; i++){
            m[i] = ListeSalles[RandomUtilities.rand(0,ListeSalles.length-1)];
        }

        return m;
    }

    private String nameGenerator() {
        return "Dungeon of " + (new NameGenerator()).getName();
    }


    public String getName() {
        return name;
    }
}
