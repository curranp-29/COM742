package Week2B;

import java.util.Scanner;

/****
 ***** Created by psd24cur on 07/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Q12dArrays {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Please input number of rows: ");
      int rows = scanner.nextInt();

      System.out.print("Please input number of columns: ");
      int columns = scanner.nextInt();


      printGrid(rows,columns);

   }//main

   public static void printGrid(int x, int y ) {
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < y; j++) {
            System.out.print("- ");
         }
         System.out.println();
      }
   }

}//class
