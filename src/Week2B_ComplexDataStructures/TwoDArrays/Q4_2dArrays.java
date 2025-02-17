package Week2B_ComplexDataStructures.TwoDArrays;

import java.util.Arrays;
import java.util.Random;//

/****
 ***** Created by psd24cur on 07/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Q4_2dArrays {
   public static void main(String[] args) {

      Random ran = new Random(0);// Random num generator obj - seed=0

      int[][] a = new int[5][5]; // 5 rows, 5 cols

      for (int r = 0; r < a.length; r++) {
         for (int c = 0; c < a[0].length; c++) {
            a[r][c] = ran.nextInt(1000) + 1; // generate random num
         }
      }

      //callPrintArrayMethod
      printArray(a);

      //deepToString
      System.out.println(Arrays.deepToString(a));

      //printTotal
      sum2dArray(a);

   }//main

   public static void printArray(int[][] array){
      for(int row = 0; row < array.length; row++){
         for(int column = 0; column < array[row].length ; column++){
            System.out.print(array[row][column] + "\t");
         }//columns
         System.out.println();
      }//rows
   }//printArray

   public static void sum2dArray(int[][] array) {
      int total = 0;

      for (int row = 0; row < array.length; row++) {
         for (int column = 0; column < array[row].length; column++) {
            total += array[row][column];
         }//columns
      }//rows
      System.out.println("Total is: " + total);
   }//sum2dArray

}//class
