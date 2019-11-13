package com.company;

import java.util.Scanner;

/**
 * Creation of the java class Command
 */
public class Command {

    private String helpMe;
    private String quitGame;
    private int index;
    Command(int a,String b){
        this.index=  a;
        this.helpMe = b;
    }
    public String getHelpMe (){
        return this.helpMe;
    }
    public int getIndex(){
        return this.index;
    }

    public static void displayHelpCommands(){
        System.out.println("0 - help");
    }
    public static void displayQuitGame(){
        System.out.println("1 - quit");
    }


    


        System.out.println("Input your choice");



        Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        if (choice.equals("O")) {
            return 1;

        } else {

            return -1;
        }


}

