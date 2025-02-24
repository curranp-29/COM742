/****
 ***** Created by psd24cur on 21/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Fibonacci {
   public static void main(String[] args) {

      fibLinear();
      System.out.println(fibRecursive(10));


   }//main

   public static void fibLinear(){
      int fibonacci = 0;
      int fibonacciPrev = 0;
      int fibonacciNew = 0;

      for(int i = 0; i < 9; i++){
         if(fibonacci == 0){
            fibonacci = 1;
            fibonacciPrev = 1;
            System.out.println(fibonacci);
            System.out.println(fibonacciPrev);
         }//if
         else{
            fibonacciNew = fibonacci + fibonacciPrev;
            System.out.println(fibonacciNew);

            fibonacciPrev = fibonacci;
            fibonacci = fibonacciNew;
         }//else
      }//for

   }//fibLinear

   public static int fibRecursive(int n){
      if(n <= 0){
         return 0;
      }//if

      else if(n == 1){
         return 1;
      }//else if

      else{
         return fibRecursive(n-1) + fibRecursive(n - 2);
      }//else
   }//fibRecursive

}//class
