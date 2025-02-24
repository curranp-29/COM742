/****
 ***** Created by psd24cur on 21/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class SumDigits_Linear_Recursive {
   public static void main(String[] args) {

      linearSum(341);
      System.out.println("Sum: " + recursiveSum(341));

   }//main

   public static void linearSum(int number){
      int sum = 0;
      while (number > 0){
         sum += number % 10;
         number = number / 10;
      }//while
      System.out.println("Sum: " + sum);
   }//linearSum


   public static int recursiveSum(int number){
      if (number == 0){
         return 0;
      }//if
      else{
         return (number % 10) + recursiveSum(number / 10);
      }//else
   }//recursiveSum

}//class
