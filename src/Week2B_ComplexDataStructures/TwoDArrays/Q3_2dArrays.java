package Week2B_ComplexDataStructures.TwoDArrays;

import java.text.DecimalFormat;
import java.util.Scanner;

/****
 ***** Created by psd24cur on 07/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Q3_2dArrays {
   public static void main(String[] args) {

      DecimalFormat decimalFormat = new DecimalFormat("00.00");
      Scanner scanner = new Scanner(System.in);

      //global variables
      int[][] integers = new int [5][2];
      double[][] doubles = new double [10][15];
      String[][] strings = new String [3][10];


      //set integer values
      for(int row = 0; row < integers.length; row++){
         for(int column = 0; column < integers[row].length; column++){
            setValueAt(integers, row, column, (int)(Math.random()*101));
         }//for
      }//for


      //set double values
      for(int row = 0; row < doubles.length; row++){
         for(int column = 0; column < doubles[row].length; column++){
            setValueAt(doubles,row, column, Math.round(Math.random()*101));
         }//for
      }//for


      String name;

      for(int row = 0; row < doubles.length; row++){
         for(int column = 0; column < doubles[row].length; column++){
            System.out.print("Please provide name: ");
            name = scanner.nextLine();
            setValueAt(strings,row, column, name);
         }//for
      }//for


   }//main


   //integer
   public static void setValueAt(int[][] a, int row, int column, int value){
      a[row][column] = value;
   }//setValueAt


   //double
   public static void setValueAt(double[][] a, int row, int column, double value){
      a[row][column] = value;
   }//setValueAt

   //String
   public static void setValueAt(String[][] a, int row, int column, String value){
      a[row][column] = value;
   }//setValueAt

   //INT
   public static int getValueAt(int[][] a, int row, int column){
      return a[row][column];
   }//getValueAt

   //DOUBLE
   public static double getValueAt(double[][] a, int row, int column){
      return a[row][column];
   }//getValueAt

   //STRING
   public static String getValueAt(String[][] a, int row, int column){
      return a[row][column];
   }//getValueAt


}//class
