package fr.istic.m2miage.dungeonassault;

/**
 * Created by fesnault on 20/11/2015.
 */
public class Player {

    private String pseudo;
    private Classe classe;

    public Player(String p, Classe c) {
        pseudo = p;
        classe = c;
    }

    public String toString() {
        return pseudo;
    }

}