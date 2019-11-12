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
    public String getIndex (){
        return this.;
    }



    static int getInputChoice() {
        System.out.println("Input your choice");

        Scanner sc = new Scanner(System.in);
        String choice = sc.next();

        if (choice.equals("O")) {
            return 1;
        } else {

            return -1;
        }
    }

}

