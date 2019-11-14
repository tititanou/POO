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
    Warrior(String n, int d, int l, int s, int i) {
        super(n, d, l, i);
        this.shield=s;
    }

    public int getShield() {
        return shield;

    }

    public String toString(){

        return super.toString()+ this.shield;

    }
}
