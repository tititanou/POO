package com;
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
     * Getters of the attributes
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

    /**
     * Method to hurt a player
     */
    public int hurt(int dmg){
        this.life = this.life-dmg;
        return this.life;
    }

    /**
     * Class surchages toString method in order to return the character and his attributes
     */
    public String toString(){
        String out =  "===== " + this.name + " =====\n";
        out = out + "Life = " + this.life + " / " + this.maxLife + "\n";
        out = out + "Damages = " + this.damages + "\n" + "Initiative = " + this.initiative +"\n";



        return out;
    }
}

