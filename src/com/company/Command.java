package com.company;

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
        System.out.println("4 - Display character's infos");
        System.out.println("5 - Begin a fight");
        System.out.println("6 - Create a F*cking warrior");
        System.out.println("7 - Create a wizard");
        System.out.println("8 - Create a thief");




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
        else if (choice.equals("5")){
            return 5;
        }
        else if (choice.equals("6")){
            return 6;
        }
        else if (choice.equals("7")){
            return 7;
        }
        else if (choice.equals("8")){
            return 8;
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
                System.out.println("Not valid. \n Create a new Character again.");
                // consume the rest of characters from the standard input
                sc.next();
            }
        }while( !isOK );
        // return the new object
        return character;
    }

    public static Warrior newWarrior(){

        int L;
        int I;
        String N ;
        int D;
        int S;

        Scanner sc = new Scanner(System.in);

        boolean isOK = false;
        Warrior character = null;
        do {
            try {
                System.out.println("Enter a Warrior Name: ");
                N = sc.next();
                System.out.println("Enter damages: ");
                D = sc.nextInt();
                System.out.println("Enter life points: ");
                L = sc.nextInt();
                System.out.println("Enter initiative: ");
                I = sc.nextInt();
                System.out.println("Enter shield point: ");
                S = sc.nextInt();
                character = new Warrior(N, D, L, I,S);
                //System.out.println(character.toString());
                isOK = true;
            } catch (Exception e) {
                System.out.println("Not valid. \n Create a new Warrior again.");
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

        System.out.println("~~~ Characters'list ~~");
        for(int i=0; i<characList.size(); i++){
            Archetype c = characList.get( i );
            System.out.println( i + " - " + c.getName());

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }

    /**
     * Methode to display characters' informations
     */
    public static void displayCharacter(List<Archetype> characterList){
        System.out.println("Enter a character's index");
        Scanner sc = new Scanner(System.in);
        int characterIndex = sc.nextInt();
        if (characterIndex >= 0 && characterIndex < characterList.size()) {
            Archetype charac = characterList.get(characterIndex);
            System.out.println( "index choice n° " + characterIndex + "\n" + charac.toString() + "\n" + "=================");
        }else{
            System.out.println("Not valid");
            Command.displayMenu();
            Command.getInputChoice();
        }
    }

    /**
     * Process requested command
     */
    public static void processCommand(int cmdNum, List<Archetype> characList){

        if( cmdNum == 0){
            Command.displayMenu();
        }
        else if( cmdNum == 1 ){
            System.out.println("Good bye");
        }
        else if ( cmdNum == 2) {
            Archetype character = Command.newCharacter();
            characList.add(character);
        }
        else if ( cmdNum == 3) {
            Command.listCharacters(characList);
        }
        else if (cmdNum == 4) {
            Command.displayCharacter(characList);
        }
        else if ( cmdNum == 5){

        }
        else if ( cmdNum == 6){
            Warrior character = Command.newWarrior();
            characList.add(character);
        }
        else if ( cmdNum == 7){

        }
        else if ( cmdNum == 8){
            
        }
        else{
            Command.displayMenu();
        }

    }


    //int monEntier = Integer.parseInt(  myStringAMoi );
}