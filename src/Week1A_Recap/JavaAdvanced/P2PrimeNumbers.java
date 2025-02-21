package Week1A_Recap.JavaAdvanced;

import java.util.Scanner;

/****
 ***** Created by pcurr on 27/01/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class P2PrimeNumbers {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Please enter a number: ");
      int input = scanner.nextInt();
      boolean isPrime = isPrimeNumber(input);

      if(isPrime){
         System.out.println("Number " + input + " is a prime number");
      }//ifTRU

      else{
         System.out.println("Number " + input + " is not a prime number");
      }//elseFALSE
   }//main

   static boolean isPrimeNumber (int num){
      if(num <= 1){
         return false;
      }//if

      //Check divisible from 2 to square root of num
      for(int x = 2; x < Math.sqrt(num); x++){
         if(num % x == 0){
            return false;
         }//if
      }//for
      return true;
   }//isPrimeNumber

}//class
