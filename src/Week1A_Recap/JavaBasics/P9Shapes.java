package Week1A_Recap.JavaBasics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P9Shapes {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        double length;
        double width;
        double height;
        double base;
        double radius;

        System.out.print("Please select a shape: ");
        System.out.println("1. Square ");
        System.out.println("2. Rectangle: ");
        System.out.println("3. Triangle: ");
        System.out.println("4. Circle: ");
        System.out.println("5. Exit ");
        System.out.println("Enter a choice between 1-5: ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                calculateSquare();
                break;

            case 2:
                calculateRectangle();
                break;

            case 3:
                calculateTriangle();
                break;

            case 4:
                calculateCircle();
                break;

            case 5:
                System.out.println("Exit");

            default:
                System.out.println("Invalid Selection");
        }while( choice != 5);

    }//main

    static void calculateSquare(){
        System.out.print("Please input length: ");
        int length = scanner.nextInt();

        System.out.println("Area is: " + (length * length));
        System.out.println("Perimeter is: " + (length * 4));
    }//calculateSquare

    static void calculateRectangle(){
        System.out.print("Please input length: ");
        int length = scanner.nextInt();

        System.out.print("Please input width: ");
        int width = scanner.nextInt();

        System.out.println("Area is: " + (length * width));
        System.out.println("Perimeter is: " + ((length + width) * 2));
    }//calculateRectangle

    static void calculateTriangle(){
        System.out.print("Please input height: ");
        int height = scanner.nextInt();

        System.out.print("Please input base: ");
        int base = scanner.nextInt();
        System.out.println("Area is: " + (height * base / 2));
    }//calculateTriangle

    static void calculateCircle(){

        DecimalFormat decimalFormat = new DecimalFormat(".00");

        System.out.print("Please input radius: ");
        int radius = scanner.nextInt();
        System.out.println("Area is : " + decimalFormat.format((radius * Math.PI * 2)));
    }//calculateCircle

}//class

