package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        /**
         * Starting message
         */
        int myChoice;

        List<com.company.Archetype> characList = new ArrayList<Archetype>();

       /* Archetype c1 = new Archetype("c1",1,1,1);
        com.company.Archetype c2 = new Archetype("c2",1,1,1);

        characList.add( c1 );
        characList.add( c2 );
        Archetype c3 = Command.newCharacter();
        characList.add(c3);

        Command.listCharacters(characList);

        */






        System.out.println("Application has started");
        System.out.println("Welcome to the game");


        //Archetype perso1 = new Archetype("hugo", 100, 50, 10);
        //System.out.println(  perso1.toString() );

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
