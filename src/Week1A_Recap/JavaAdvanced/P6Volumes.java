package Week1A_Recap.JavaAdvanced;

import java.text.DecimalFormat;
import java.util.Scanner;

/****
 ***** Created by pcurr on 28/01/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class P6Volumes {

    static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {

       DecimalFormat decimalFormat = new DecimalFormat(".00");

       System.out.println("Please select a shape: ");
       System.out.println("1. Sphere ");
       System.out.println("2. Cylinder: ");
       System.out.println("3. Exit ");
       System.out.print("Enter a choice between 1-3: ");
       int choice = scanner.nextInt();
       double radius;

       switch (choice){
           case 1:
               System.out.println("Volume of sphere is: " + decimalFormat.format(calculateSphere()));
               break;

           case 2:
               System.out.println("Volume of cylinder is: " + decimalFormat.format(calculateCylinder()));
               break;

           case 3:
               System.out.println("Exit");

           default:
               System.out.println("Invalid Selection");
       }while( choice != 3);

   }//main


    static double calculateSphere(){
        System.out.print("Please enter radius: ");
        double radius = scanner.nextDouble();
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }//calculateSphere

    static double calculateCylinder(){
        System.out.print("Please enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Please enter height: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }//calculateCylinder

}//class
