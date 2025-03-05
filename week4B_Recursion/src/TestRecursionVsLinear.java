/****
 ***** Created by psd24cur on 21/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class TestRecursionVsLinear {
   public static void main(String[] args) {

      int n = 8;

      long CurrentTime = System.nanoTime();
      System.out.println(n + "! = " + factorialLinear(n));
      long CurrentTimeEnd = System.nanoTime();
      long Totaltime = CurrentTimeEnd - CurrentTime;
      System.out.println("Total time (ns): " + Totaltime);

      CurrentTime = System.nanoTime();
      System.out.println(n + "! = " + factorialRecursion(n));
      CurrentTimeEnd = System.nanoTime();
      Totaltime = CurrentTimeEnd - CurrentTime;
      System.out.println("Total time (ns): " + Totaltime);


   }//main

   private static int factorialRecursion(int n){
      int result = 1;

      if(n == 1){
         return 1;
      }//if

      else{
         return n * factorialRecursion(n - 1);
      }
   }//factorialRecursion


   private static int factorialLinear(int n){
      //base result
      int result = 1;

      for(int i = 1; i <= n; i++){
         result = result * i;
         System.out.println(result);
      }//for

      return result;
   }//factorialLinear

}//class
