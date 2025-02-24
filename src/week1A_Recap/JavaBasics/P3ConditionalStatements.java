package week1A_Recap.JavaBasics;

import java.util.Scanner;

public class P3ConditionalStatements {

    public static void main(String[] args) {

        //initialise Scanner
        Scanner keyboard = new Scanner(System.in);

        int input;

        System.out.print("Please input a number: ");
        input = keyboard.nextInt();

        if(input % 2 == 0){
            System.out.println("Number provided " + input + " is even.");
        }//if
        else{
            System.out.println("Number provided " + input + " is false.");
        }//else

    }//main
}//class
