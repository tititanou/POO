package com.company;


public class Warrior extends Archetype {

    private int shield;

    /**
     * Constructor method
     *
     * @param n
     * @param d
     * @param l
     * @param i
     */
    Warrior(String n, int d, int l, int i, int s) {
        super(n, d, l, i);
        this.shield = s;
    }

    public int getShield() {
        return shield;

    }


    public int hurt(int dmg) {

        this.shield=this.shield-dmg;
        if (shield<0){
            super.hurt(-shield);
            shield= 0;
        }

        return getLife();
    }


    public String toString() {

        return super.toString() + "shield =" + this.shield;

    }

}