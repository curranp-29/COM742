package Week1A.JavaBasics;

import java.util.Scanner;

public class P5Methods {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Please input number: ");
        a = keyboard.nextInt();

        System.out.print("Please input another number: ");
        b = keyboard.nextInt();

        System.out.println("Sum of numbers is " + sumNum(a, b));
        System.out.println("Subtract numbers is " + subtractNum(a, b));
        System.out.println("Product of numbers is " + productNum(a, b));
        System.out.println("Quotient numbers is " + quotientNum(a, b));

    }//main

    public static int sumNum(int a, int b){
        int sum = a * b;
        return sum;
    }//sumNum

    public static int subtractNum(int a, int b){
        int value = 0;
        if(a > b){
            value = a - b;
        }//if

        if(b > a){
            value = a - b;
        }//if
        return value;
    }//subtractNum

    public static int productNum(int a, int b){
        int value = a * b;
        return value;
    }//productNum

    public static double quotientNum(int a, int b){
        double value = a - b;
        return value;
    }//subtractNum





}//class
