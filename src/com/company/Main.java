package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // write your code here


        int myChoice; // to return if my choice is valid
        List<Archetype> characList = new ArrayList<Archetype>(); // list to save the characters

        /**
         * Starting message
         */
        System.out.println("Application has started");
        System.out.println("Welcome to the game");

        /**
         * Game process
         */
        Command.displayMenu();
        do {
            myChoice = Command.getInputChoice();
            // process command only of it is a valid one
            if (myChoice != -1) {
                Command.processCommand(myChoice,characList);
            }
        } while(myChoice != 1);




    }

}
