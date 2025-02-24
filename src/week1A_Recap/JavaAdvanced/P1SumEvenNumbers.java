package week1A_Recap.JavaAdvanced;

import java.util.Scanner;

/****
 ***** Created by pcurr on 27/01/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class P1SumEvenNumbers {

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      int input;
      int sum = 0;

      System.out.print("Please enter a number: ");
      input = scanner.nextInt();

      for(int x = 1; x <= input; x++){
         if(x % 2 == 0){
            sum += x;
         }//if
      }//for

      System.out.println("Sum of even numbers between 1 and " + input + " = " + sum);

   }//main
}//class
