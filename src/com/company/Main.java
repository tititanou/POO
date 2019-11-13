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
        System.out.println("welcome to the game");

        /*Command h = new Command(0, "help");
        System.out.println(h.getIndex()+ " "+ h.getHelpMe());*/

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
