package com.company;

public class Thief extends Archetype {

    private float dodgeProba;
    private float criticalDamages;


    /**
     * Constructor method
     *
     * @param n
     * @param d
     * @param l
     * @param i
     */
    Thief(String n, int d, int l, int i,float dodge, float cd ) {
        super(n, d, l, i);
        this.dodgeProba = dodge;
        this.criticalDamages = cd;
    }

    public float getDodgeProba() {
        return dodgeProba;
    }

    public float getCriticalDamages() {
        return criticalDamages;
    }

    public String toString(){
      String out = super.toString();
      out = out + "Dodge = " + this.dodgeProba + "\n Critical Damages = " + this.criticalDamages;
      return out;
    }
}
