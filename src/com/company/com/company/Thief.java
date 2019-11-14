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

    Thief(){
        super("nooby", 0,1,0);
    }
    Thief(String n, int d, int l, int i,float dodge, float cd ) {
        super(n, d, l, i);
        this.dodgeProba = dodge;
        this.criticalDamages = cd;
    }


    
}
