package fr.istic.m2miage.dungeonassault.utility;

/**
 * Created by epeti on 21/11/2015.
 */
public class Experience {

    /**
     *  Calcule l'expérience require pour atteindre le niveau level
     * @param level
     * @return
     */
    public static int ExpToNextLevel(int level){

        int exp = (int) (Math.exp(level) * 50);

        return exp;
    }
}
