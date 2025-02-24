package week2B_ComplexDataStructures.TwoDArrays;

/****
 ***** Created by psd24cur on 07/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/

public class Q5_2dArrays {
   public static void main(String[] args) {

      char [][]a = new char[][]{{'a','b','c'},
                                 {'d','d','d'},
                                 {'g','h','i'}};

      findChar2DArray(a,'b');
      findChar2DArray(a,'d');
      findChar2DArray(a,'z');
   }//main

   public static boolean findChar2DArray(char[][] a, char c2f) {


      for(int row = 0; row < a.length; row++){
         for(int column = 0; column < a[row].length; column++){
            if(a[row][column] == c2f){
               System.out.println("Char: " + c2f + " @ " + "(" + row + ", " + column + ")");
               return true;
            }

         }
      }
      System.out.println("Char: " + c2f + " not found");
      return false;
   }
}//class
