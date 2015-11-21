package fr.istic.m2miage.dungeonassault.utility;

/**
 * Created by epeti on 21/11/2015.
 */
public class LivingEntity {

    private float currentHealth;
    private float maxHealth;
    private boolean dead;

    public LivingEntity(float m) {
        currentHealth = m;
        maxHealth = m;
        dead = false;
    }

    public void takeDamage(float dmg){

        if(!dead){

            currentHealth += dmg;

            if(currentHealth <= 0){
                dead = true;
                currentHealth = 0;
            }
        }
    }

    public float getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(float currentHealth) {
        this.currentHealth = currentHealth;
    }

    public float getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(float maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

}
