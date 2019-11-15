package com.company;

public class Wizard extends Archetype {

    /**
     * The wizard's skill is magic.
     *
     * 'A wizard is never late, Frodo Baggins. Nor is he early, he arrives precisely when he means to.'
     */
    private int initialmagicdamages;
    private int magicdamages;

    /**
     * Constructor method
     *
     * @param n
     * @param d
     * @param l
     * @param i
     */
    Wizard(String n, int d, int l, int md, int imd, int i) {
        super(n, d, l, i);
        this.initialmagicdamages = imd;
        this.magicdamages = md;
    }

    /**
     * The magic damages are added to the normal damages the wizard makes.
     * The magic damages are divided by 2 at every attack.
     *
     * For example :
     *
     * 1st attack = normal damages + magic damages
     * 2nd attack = normal damages + (magic damages) ÷ 2
     * 3rd attack = normal damages + (magic damages) ÷ 4
     * 4th attack = normal damages + (magic damages) ÷ 8
     * 5th attack = normal damages + (magic damages) ÷ 16
     * 6th attack = normal damages + (magic damages) ÷ 32
     *
     * And on and on...
     *
     * 'YOU SHALL NOT PASS!'
     */
    /*public int shieldHurt(int dmg) {

        this.initialmagicdamages=this.initialmagicdamages-dmg;
        if (shield<0){
            super.hurt(-shield);
            shield= 0;
        }

        return getLife();
    }

     */
    public String toString() {

        String out = super.toString();
        out = out + "Dégâts Magiques = " + magicdamages + "/" + initialmagicdamages + "\n";
        return out;
    }

    public int getDamages() {
        int magicstock = this.magicdamages;
        magicdamages = magicdamages/2;
        return super.getDamages() + magicstock;
    }
}
