package Week1A_Recap.JavaAdvanced;

import java.text.DecimalFormat;
import java.util.Scanner;

/****
 ***** Created by pcurr on 27/01/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class P4TempConverter {

   public static void main(String[] args) {

      DecimalFormat decimalFormat = new DecimalFormat("00.0");

      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to temperature converter");
      System.out.println("Press 1 to convert Celsius to Fahrenheit");
      System.out.println("Press 2 to convert Fahrenheit to Celsius");
      System.out.println("Press 3 to Exit");
      System.out.println("Enter a choice between 1-3: ");
      int choice = scanner.nextInt();
      double temperature;

      switch (choice){
         case 1:
            System.out.print("Please provide temperature in Celsius: ");
            temperature = scanner.nextDouble();
            System.out.println(temperature + " converted to Fahrenheit is " + decimalFormat.format(calculateFahrenheit(temperature)));
            break;

         case 2:
            System.out.print("Please provide temperature in Fahrenheit: ");
            temperature = scanner.nextDouble();
            System.out.print(temperature + " converted to Celsius is " + decimalFormat.format(calculateCelsius(temperature)));
            break;

         case 3:
            System.out.println("Exit");

         default:
            System.out.println("Invalid Selection");
      }while( choice != 3);





   }//main

   static double calculateFahrenheit(double temperature){
      return ((temperature * 9 / 5) + 32);
   }//calcF

   static double calculateCelsius(double temperature){
      return ((temperature - 32) * 5 / 9);
   }//calcC

}//class
