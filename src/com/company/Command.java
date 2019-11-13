package com.company;

import java.util.Scanner;

/**
 * Creation of the java class Command
 */
public class Command {



    public static void displayHelpCommands(){
        System.out.println("====================");
        System.out.println("0 - help");
        System.out.println("1 - quit");
    }

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
        else{
            return -1;
        }
    }


    // process requested command
    public static void processCommand(int cmdNum){

        if( cmdNum == 0){
            Command.displayHelpCommands();
        }
        else if( cmdNum == 1 ){
            System.out.println("Good bye");
        }
        else{
            Command.displayHelpCommands();
        }

    }

}