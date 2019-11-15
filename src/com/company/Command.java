package com.company;

import java.util.List;
import java.util.Scanner;

/**
 * Creation of the java class Command
 */
public class Command {


    /**
     * Display the commands list
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
        System.out.println("9 - Delete a character");




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
        else if (choice.equals("9")){
            return 9;
        }

        else {
            return -1;
        }
    }

    /**
     *Method to create a character
     */

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

    /**
     * This method allows 2 characters to fight
     * @param a1
     * @param a2
     */
    public static void fight(Archetype a1 , Archetype a2){
    Archetype c1;
    Archetype c2;
    int init1 = a1.getInitiative();
    int init2 = a2.getInitiative();

    if (init1 == init2){
        double R = Math.random();
        if(R >= 0.5){
            init2 = 0;
        }
        else {
            init1 = 0;
        }
    }

    if(init1 < init2){
        c1 = a2;
        c2 = a1;
    }
    else {
        c1 = a1;
        c2 = a2;
    }

    int dmg;
    int l;
    Archetype assailant;
    Archetype defender;
    int i = 1;

    do{
        System.out.println("Round " + i);
        if (i % 2 !=  0){
            assailant = c1;
            defender = c2;
        }
        else {
            assailant = c2;
            defender = c1;
        }
        dmg = assailant.getDamages();
        defender.hurt(dmg);
        System.out.println(assailant.getName() + " inflicts '" + dmg + " damages' points.");
        l = defender.getLife();
        System.out.println(defender.getName() + " has " + l + " life points.");
        i = i + 1;
    }
    while (l > 0);
    System.out.println("The " + assailant.getClass().getSimpleName() + " named " + assailant.getName() + " is the winner." );
    }

    /**
     * Method to create a warrior
     */
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
     *Method to create a thief
     */
    public static Thief newThief(){

        int L;
        int I;
        String N ;
        int D;
        double dodgeProba;
        double C;

        Scanner sc = new Scanner(System.in);

        boolean isOK = false;
        Thief character = null;
        do {
            try {
                System.out.println("Enter a thief name:");
                N = sc.next();
                System.out.println("Enter damages: ");
                D = sc.nextInt();
                System.out.println("Enter life points: ");
                L = sc.nextInt();
                System.out.println("Enter initiative: ");
                I = sc.nextInt();
                System.out.println("Enter dodge: ");
                dodgeProba = sc.nextDouble();
                System.out.println("Enter critical damage: ");
                C = sc.nextDouble();
                character = new Thief (N, D, L, I, dodgeProba,C);
                //System.out.println(character.toString());
                isOK = true;
            } catch (Exception e) {
                System.out.println("Not valid. \n Create a new thief again.");
                // consume the rest of characters from the standard input
                sc.next();
            }
        }while( !isOK );
        // return the new object
        return character;
    }

    /**
     * Method to display characters' informations
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
     * Method to create a wizard
     */
    public static Wizard newWizard() {
        int L;
        int I;
        String N;
        int D;
        int MD;
        int IMD;
        Scanner sc = new Scanner(System.in);
        boolean isOK = false;
        Wizard character = null;
        do {
            try {
                System.out.println("Enter a Wizard Name: ");
                N = sc.next();
                System.out.println("Enter damages: ");
                D = sc.nextInt();
                System.out.println("Enter life points: ");
                L = sc.nextInt();
                System.out.println("Enter initiative: ");
                I = sc.nextInt();
                System.out.println("Enter magic damages points: ");
                MD = sc.nextInt();
                character = new Wizard(N, D, L, I, MD);
                //System.out.println(character.toString());
                isOK = true;
            } catch (Exception e) {
                System.out.println("Not valid. \n Create a new Wizard again.");
                // consume the rest of characters from the standard input
                sc.next();
            }
        } while (!isOK);
        return character;
    }


    /**
     * Method to delete a character
     */
    public static void deleteCharacter(List<Archetype> characList ){
        System.out.println("Which character do you want to delete?\nPut the index");
        Command.listCharacters(characList);
        Scanner sc = new Scanner(System.in);
        int characterIndex = sc.nextInt();
        if (characterIndex >= 0 && characterIndex < characList.size()) {
            System.out.println("Do you want to delete character n°" + characterIndex + "?\n Yes/No");
            String input = sc.next();
            String answer = input.toLowerCase();
            if (answer.equals("yes")) {
                Archetype charac = characList.remove(characterIndex);
                System.out.println( charac.getClass().getSimpleName() + " " + charac.getName() + " has been deleted.");
            }
        }else{
            System.out.println("Not valid");
            Command.displayMenu();
            Command.getInputChoice();
        }
    }

    /**
     *
     * @param characList
     * @param numSelect
     * @return
     * This method allows you to select 1 fighter
     */
    private static Archetype selectCharacterForFighting(List<Archetype> characList, int numSelect){
        //---------- choice of player ----------
        Archetype myPlayer = null;

        do {
            String answer = "";
            try {

                Command.listCharacters(characList);
                System.out.println("Choose YOUR character: #" + numSelect);
                Scanner sc = new Scanner(System.in);
                answer = sc.next();
                int characterChoice = Integer.parseInt(answer);
                if (characterChoice >= 0 && characterChoice < characList.size()) {
                    myPlayer = characList.get(characterChoice);
                    System.out.println("Your choice is :\n " + myPlayer + "\n yes/no ?");
                    String input = sc.next();
                     answer = input.toLowerCase();
                    if (!answer.equals("yes")) {
                        if (!answer.equals("no")){
                            System.out.println("HEY!!! I am not an idiot!\n Stop writing this type of bullsh*t :" + "  ---> " + answer + "\nJust say YES or NO");
                        }

                        myPlayer = null;
                    }

                }
            } catch (Exception e){
                System.out.println("NOOOOOOOOO !!\nDon't be an idiot ! Do not say:" + "  ---> " + answer + "\nYou have to Enter an integer.\nLike: 69 ");

            }
        } while( myPlayer == null);
        return myPlayer;
    }

    /**
     *
     * @param characList
     *This method allows you to choose two characters to make them fight
     */
    public static void preparFight(List<Archetype>characList) {

        Archetype p1 = Command.selectCharacterForFighting(characList,1);
        Archetype p2 = Command.selectCharacterForFighting(characList,2);
       // FIGHT
        Command.fight(p1,p2);



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
        else if ( cmdNum == 5) {

            preparFight(characList);

        }
        else if ( cmdNum == 6){
            Warrior character = Command.newWarrior();
            characList.add(character);

        }
        else if ( cmdNum == 7){
            Wizard character = Command.newWizard();
            characList.add(character);
        }
        else if ( cmdNum == 8){
            Thief thief = Command.newThief();
            characList.add(thief);
        }
        else if ( cmdNum == 9){
            Command.deleteCharacter(characList);
        }
        else{
            Command.displayMenu();
        }
    }

}