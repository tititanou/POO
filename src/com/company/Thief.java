package com.company;

public class Thief extends Archetype {

    private float dodgeProba;
    private float criticalDamages;


    /**
     * Constructor method
     * @param n Character's name
     * @param d Damages that the character can inflict
     * @param l Initial points of life of the character
     * @param i Initiative value of the character
     * @param dodge Character's probability to dodge the attack
     * @param cd Character's probability to inflict critical damages
     */
    Thief(String n, int d, int l, int i,float dodge, float cd ) {
        super(n, d, l, i);
        this.dodgeProba = dodge;
        this.criticalDamages = cd;
    }

    /**
     * To get the dodge probability
     */
    public float getDodgeProba() {
        return dodgeProba;
    }

    /**
     * To get the critical damages probability
     */
    public float getCriticalDamages() {
        return criticalDamages;
    }

    /**
     * To return the character's info
     */
    public String toString(){
      String out = super.toString();
      out = out + "Dodge = " + this.dodgeProba + "\n Critical Damages = " + this.criticalDamages;
      return out;
    }
}
