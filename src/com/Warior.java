package com;


import com.Archetype;

public class Warior extends Archetype {

    private int shield;
    /**
     * Constructor method
     *
     * @param n
     * @param d
     * @param l
     * @param i
     */
    Warior(String n, int d, int l, int s, int i) {
        super(n, d, l, i);
        this.shield=s;
    }
    public String toString(){

        return super.toString()+" reste a faire !!!!!";
    }
}
