package com.company;
/**
 * Creation of the java class Archetype
 */
public class Archetype {


    /**
     * Private attributes of the archetype
     */

    private String name;
    private int damages;
    private int life;
    private int maxLife;
    private int initiative;

    /**
     * Constructor method
     */

    Archetype (String n , int d , int l , int i) {
        this.name = n;
        this.damages = d;
        this.life = l;
        this.maxLife = l;
        this.initiative= i;
    }

    /**
     *
     */

    public String getName(){
        return this.name;
    }

    public int getDamages(){
        return this.damages;
    }

    public int getLife(){
        return this.life;
    }

    public int getMaxLife(){
        return this.maxLife;
    }

    public int getInitiative(){
        return this.initiative;
    }

    public int hurt(int dmg){
        this.life = this.life-dmg;
        return this.life;
    }

    public void displayPerso()
}


