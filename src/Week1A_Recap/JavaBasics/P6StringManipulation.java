package Week1A_Recap.JavaBasics;

import java.util.Scanner;

public class P6StringManipulation {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String name;
        System.out.print("Please enter name: ");
        name = keyboard.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());


        //StringBuilder to reverse
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        System.out.println("Reverse: " + stringBuilder.reverse());
        System.out.println("Contains '@': " + name.contains("@"));

        keyboard.close();

    }//main
}//class
