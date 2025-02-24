package week2B_ComplexDataStructures.Hash;

import java.util.HashSet;
import java.util.Set;

/****
 ***** Created by psd24cur on 07/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Q4_Hash {
   public static void main(String[] args) {

      int[] array = {77,23,4,66,99,112,45,56,39,89,10};

      Set<Integer> numbers = new HashSet<>();
      //populateSet
      for(int i = 0; i < array.length; i++){
         numbers.add(array[i]);
      }//for

      System.out.println(numbers);

      Set<Integer> numbers3 = new HashSet<>();
      for(int i = 0; i < array.length; i++){
         numbers3.add(array[i] * 3);
      }//for

      System.out.println(numbers3);

   }//main
}//class
