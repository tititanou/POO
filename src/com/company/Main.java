package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        /**
         * Starting message
         */
        int myChoice;

        System.out.println("Application has started");
        System.out.println("Welcome to the game");



        Archetype perso1 = new Archetype("hugo", 100, 50, 10);


        System.out.println( perso1.getLife() + "/" + perso1.getMaxLife() );
        perso1.hurt(30);
        System.out.println( perso1.getLife() + "/" + perso1.getMaxLife() );


        Command.displayHelpCommands();

        do {

            myChoice = Command.getInputChoice();

            // process command only of it is a valid one
            if (myChoice != -1) {
                Command.processCommand(myChoice);
            }
        } while(myChoice != 1);






    }

}
