package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /**
         * Starting message
         */

        System.out.println("Application has started");
        System.out.println("welcome to the game");

        Command h = new Command(0, "help");
        System.out.println(h.get);
    }

}
