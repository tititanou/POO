package com.company;


public class Warior extends Archetype {

    private shield;
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
        String out =  "===== " + this.name + " =====\n";
        out = out + "Life = " + this.life + " / " + this.maxLife + "\n";
        out = out + "Damages = " + this.damages + "\n" + "Initiative = " + this.initiative +"\n";

    }
}
