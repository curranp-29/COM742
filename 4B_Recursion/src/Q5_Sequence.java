/****
 ***** Created by psd24cur on 21/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Q5_Sequence {
   public static void main(String[] args) {

      int n = 30;

      for(int i = 0; i < n; i++){
         System.out.print(Sequence(i) + " ");
      }//for

   }//main

   public static int Sequence(int n){
      if(n == 0){
         return 3;
      }//if
      else{
         return Sequence(n-1) + 2;
      }//else
   }//Sequence


}//class
