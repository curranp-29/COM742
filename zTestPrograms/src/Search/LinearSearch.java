package Search;

import java.util.Arrays;
import java.util.Random;

/****
 ***** Created by psd24cur on 14/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class LinearSearch {
   public static void main(String[] args) {

      Random random = new Random();
      int [] arrayRandom = new int[100];
      for(int i = 0; i < arrayRandom.length; i++){
         arrayRandom[i] = random.nextInt(100)+1;
      }//for

      System.out.println(Arrays.toString(arrayRandom));

      System.out.println(linearSearch(arrayRandom, 95));

   }//main


   public static int linearSearch(int [] array, int key){
      int comparisons = 0;
      //iterate over each element in array
      for(int i = 0; i < array.length; i++){
         comparisons++;
         if(key == array[i]){
            System.out.println("Comparisons: " + comparisons);
            return i;//found so return position
         }//if
      }//for

      System.out.println("Comparisons: " + comparisons);
      return -1;
   }//LinearSearch

}//class
