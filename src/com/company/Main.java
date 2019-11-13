package com.company;

import java.util.Scanner;

public class Main {
    /**
     * command to choice begin or quit
     */
    static void getInputChoice() {
        boolean validResponse = true;

        do {
            System.out.println("write your choice begin/quit:");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            String response = input.toLowerCase();

            if (response.equals("begin")) {
                validResponse = true;
                System.out.println("Choice your character");


            } else if (response.equals("quit")) {
                validResponse = true;

                System.out.println("Game is finished !");

            } else {
                validResponse = false;
            }


        } while (!validResponse);

    }


    public static void main(String[] args) {
        // write your code here
        /**
         * Starting message
         */

        System.out.println("Application has started");
        System.out.println("welcome to the game");

        /*Command h = new Command(0, "help");
        System.out.println(h.getIndex()+ " "+ h.getHelpMe());*/

        Command.displayHelpCommands();

        Command.displayQuitGame();

        getInputChoice();
    }

}
