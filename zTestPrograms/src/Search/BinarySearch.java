package Search;

import java.util.Arrays;
import java.util.Random;

/****
 ***** Created by psd24cur on 14/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class BinarySearch {
   public static void main(String[] args) {

      Random random = new Random();
      int[] arrayRandom = new int[100];
      for(int i = 0; i < arrayRandom.length; i++){
         arrayRandom[i] = random.nextInt(100)+ 1;
      }//for

      System.out.println(Arrays.toString(arrayRandom));

      //Needs sorted
      Arrays.sort(arrayRandom);
      System.out.println(Arrays.toString(arrayRandom));

      //Search
      System.out.println(binarySearch(arrayRandom,95));

   }//main


   public static int binarySearch( int[] array, int key){
      int comparisons = 0;
      int left = 0, right = array.length-1;//left and right values

      while(left <= right){
         int pivot = (left + right)/2;//pivot
         if(key == array[pivot]){
            System.out.println("Comparisons: " + comparisons);
            return pivot;//found
         }//if
         else if (key > array[pivot]){
            left = pivot + 1;
            comparisons++;
         }//else if
         else{
            right = pivot - 1;
            comparisons++;
         }//else
      }
      System.out.println("Comparisons: " + comparisons);
      return -1;//not found so return -1

   }//binarySearch



   public static int binarySearch(String[] items, String key){
      int left = 0, right = items.length - 1;

      while (left <= right){
         int pivot = (left + right)/2;
         if (key.compareTo(items[pivot]) == 0) {
            return pivot;//found
         } else if (key.compareTo(items[pivot]) > 0){
               left = pivot +1; //searchRight
            }//else
            else{
               right = pivot -1;//search left
            }
         }
      return -1;//not found
      }//binarySearch

}//class
