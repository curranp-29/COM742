package week1A_Recap.JavaAdvanced;
import java.util.Scanner;

/****
 ***** Created by pcurr on 27/01/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class P3MinMax {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.print("How many numbers would you like to add?: ");
      int size = scanner.nextInt();

      int [] array = new int[size];

      for(int x = 0; x < array.length; x++){
         System.out.print("Please input number " + (x + 1) + ": ");
         array[x] = scanner.nextInt();
         scanner.nextLine();
      }//for

      minMax(array);

   }//main

   static void minMax(int[] array){

      int min = array[0], max = array[0];

      for (int index = 0; index < array.length; index++){
         System.out.println(array[index]);
         if (array [index] < min){
            min = array [index];
         }//if
         if (array [index] > max){
            max = array [index];
         }//if
      }//for
      System.out.println("Min value in array is " + min);
      System.out.println("Max value in array is " + max);
   }//minMax

}//class
