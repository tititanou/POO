package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Creation of the java class Command
 */
public class Command {


    /**
     * Display
     */
    public static void displayMenu(){
        System.out.println("====================");
        System.out.println("0 - Help");
        System.out.println("1 - Quit");
        System.out.println("2 - Create new character");
        System.out.println("3 - List created characters");
        System.out.println("4 - Display character infos");

    }

    /**
     * Method to make a choice
     */
    public static int getInputChoice() {
        System.out.println("Input your choice");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        if (choice.equals("0")) {
            return 0;
        }
        else if (choice.equals("1")) {
            return 1;
        }
        else if (choice.equals("2")) {
            return 2;
        }
        else if (choice.equals("3")) {
            return 3;
        }
        else if(choice.equals("4")) {
            return 4;
        }
        else {
            return -1;
        }
    }

    /**
     *Method to create a character
     */
    // Ne pas oublier de régler le problème sur les entrées inalides "iuhukjhjkbh"
    public static Archetype newCharacter(){

        int L;
        int I;
        String N ;
        int D;
        Scanner sc = new Scanner(System.in);

        boolean isOK = false;
        Archetype character = null;
        do {
            try {
                System.out.println("Enter a name:");
                N = sc.next();
                System.out.println("Enter damages: ");
                D = sc.nextInt();
                System.out.println("Enter life points: ");
                L = sc.nextInt();
                System.out.println("Enter initiative: ");
                I = sc.nextInt();
                character = new Archetype(N, D, L, I);
                //System.out.println(character.toString());
                isOK = true;
            } catch (Exception e) {
                System.out.println("Mauvaise entrée. Recommencez.");
                // consume the rest of characters from the standard input
                sc.next();
            }
        }while( !isOK );
        // return the new object
        return character;
    }

    /**
     * Method to list created characters
     */
    public static void listCharacters(List<Archetype> characList){
        for(int i=0; i<characList.size(); i++){
            Archetype c = characList.get( i );
            System.out.println( c + " " + i);
        }
    }

    /**
     * Methode to display characters' informations
     */
    public static void displayCharacter(Archetype charac){
        System.out.println(charac.toString());
    }

    /**
     * Process requested command
     */
    public static void processCommand(int cmdNum){

        if( cmdNum == 0){
            Command.displayMenu();
        }
        else if( cmdNum == 1 ){
            System.out.println("Good bye");
        }
        else if ( cmdNum == 2) {
            Command.newCharacter();
        }
        else if ( cmdNum == 3) {

        }

        else{
            Command.displayMenu();
        }

    }


    //int monEntier = Integer.parseInt(  myStringAMoi );
}