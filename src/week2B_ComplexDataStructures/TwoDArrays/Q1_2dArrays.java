package week2B_ComplexDataStructures.TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

/****
 ***** Created by psd24cur on 07/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Q1_2dArrays {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Please input number of rows: ");
      int rows = scanner.nextInt();

      System.out.print("Please input number of columns: ");
      int columns = scanner.nextInt();

      int[][]array = new int[rows][columns];

      printGrid(array);
      System.out.println(Arrays.deepToString(array));

   }//main


   public static void printGrid(int [][] array){
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[i].length; j++) {
            System.out.print("- ");
         }//for
         System.out.println();
      }//for
   }//printGrid

}//class
