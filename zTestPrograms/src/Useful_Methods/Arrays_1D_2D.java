package Useful_Methods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

/****
 ***** Created by psd24cur on 28/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Arrays_1D_2D {
   public static void main(String[] args) {

      //1D
      int [] array1d = generateRandom();
      System.out.println(Arrays.toString(array1d));
      calculateAverage(array1d);
      findMaxMin(array1d);
      findValue(array1d, 5);
      sumValues(array1d);
      reverseArrayNonSequential(array1d);

      //2D
      int [][] array2d =  generateRandom(100);
      System.out.println("Sum of matrix: " + sumMatrix(array2d));
      printArray(array2d);

   }//main

   //ARRAY
   public static int [] generateRandom(){
      int [] num = new int[100];
      int min = 1;
      int max = 100;

      for(int i = 0; i < num.length; i++){
         num[i] = (int)(Math.random() * (max - min + 1) + min);
      }//for
      return num;
   }//generateRandom

   public static void fillArray(int[] array){
      for(int index = 0; index < array.length; index++){
         array[index] = index + 1;
      }//for
   }//fillArray

   public static void calculateAverage(int[] scores){
      int sum = 0;
      for (int index = 0; index < scores.length; index++){
         sum += scores[index];
      }//for
      System.out.println("Average is: " + (double) sum/ scores.length);
   }//calculateAverage

   public static void findMaxMin(int[] numbers){
      int max = numbers [0];
      int min = numbers [0];

      for(int index = 0; index < numbers.length; index++){
         if(numbers[index] > max){
            max = numbers[index];
         }//if
         if(numbers[index] < min){
            min = numbers[index];
         }//if
      }//for
      System.out.println("Max value in array is: " + max);
      System.out.println("Min value in array is: " + min);
   }//findMax

   public static void findValue(int[] numbers, int find){
      boolean found = false;
      for(int index = 0; index < numbers.length; index++){
         if(numbers[index] == find){
            System.out.println("Find value " + find + " found at index " + index);
            found = true;
         }//if
      }//for
      if(!found){
         System.out.println("Find value " + find + " not found");
      }//if
   }//findValue

   public static void sumValues(int[] numbers){
      int total = 0;
      for(int index = 0; index < numbers.length; index++){
         total += numbers[index];
      }//for
      System.out.println("Sum of values is: " + total);
   }//sumValues

   public static void reverseArrayNonSequential(int[] array){
      int start = 0;
      int end = array.length - 1;
      while(start < end){
         int temp = array[start];
         array[start] = array[end];
         array[end] = temp;
         start++;
         end--;
      }//while
      printArray(array);
   }//reverse

   public static void printArray(int[] numbers){
      for(int index = 0; index < numbers.length; index++){
         System.out.print(numbers[index] + " ");
      }//for
      System.out.println();
   }//printArray


   //2D ARRAY
   public static int [][] generateRandom(int size){
      Random rand = new Random();
      int [][] num = new int[size][size];
      for(int i = 0; i < num.length; i++){
         for(int j = 0; j < num[0].length; j++)
            num[i][j] = rand.nextInt(size)+ 1;
      }//for
      return num;
   }//generateRandom

   private static void fillArray(int [][] array){
     //fill2D array
      for (int row = 0; row < array.length; row++){
         for (int column = 0; column < array[row].length; column++){
            array[row][column] = row;
         }//for
      }//for
   }//fillArray

   private static void fillArray(String [][] array){
      //populate seats with A to represent no booking
      for (int row = 0; row < array.length; row++){
         for (int column = 0; column < array[row].length; column++){
            array[row][column] = "A";
         }//for
      }//for
   }//fillArray

   public static int sumMatrix(int[][] array) {
      int sum = 0;
      for (int row = 0; row < array.length; row++){
         for (int column = 0; column < array[row].length; column++){
            sum += array[row][column];
         }//for
      }//for
      return sum;
   }//sumMatrix

   public static void printArray(int[][] array){
      for (int row = 0; row < array.length; row++){
         for (int column = 0; column < array[row].length; column++){
            System.out.print( array[row][column]+ " ");
         }//for
         System.out.println();
      }//for
   }//printArray

   public static LinkedList<Integer> populateRandom(int size){
      //declare list
      LinkedList<Integer> list = new LinkedList<>();

      //create random object
      Random random = new Random();

      //populate list with random number 1-100
      for(int i = 0; i < size; i++){
         list.add(random.nextInt(100)+1);
      }//for
      return list;
   }

}//class
