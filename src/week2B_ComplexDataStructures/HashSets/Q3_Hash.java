package week2B_ComplexDataStructures.HashSets;

import java.util.HashSet;
import java.util.Set;

/****
 ***** Created by psd24cur on 07/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Q3_Hash {
   public static void main(String[] args) {

      Set<Integer> numbers = new HashSet<>();
      Set<Integer> numbersEven= new HashSet<>();
      Set<Integer> numbersOdd= new HashSet<>();

      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(4);
      numbers.add(5);
      numbers.add(6);

      numbersEven.add(2);
      numbersEven.add(4);
      numbersEven.add(6);
      numbersEven.add(8);
      numbersEven.add(10);
      numbersEven.add(12);

      numbersOdd.add(1);
      numbersOdd.add(3);
      numbersOdd.add(5);
      numbersOdd.add(7);
      numbersOdd.add(9);

      Set<Integer> differenceOdd = new HashSet<>();
      differenceOdd.addAll(numbers);
      differenceOdd.removeAll(numbersOdd);
      System.out.println("Difference in odd set and numbers set: " + differenceOdd);

      Set<Integer> differenceEven = new HashSet<>();
      differenceEven.addAll(numbers);
      differenceEven.removeAll(numbersEven);
      System.out.println("Difference in even set and numbers set: " + differenceEven);

      numbers.remove(4);
      numbersEven.remove(4);
      numbersOdd.remove(4);

      System.out.println(numbers);
      System.out.println(numbersEven);
      System.out.println(numbersOdd);


      //add more numbers to determine subset
//      numbers.add(7);
//      numbers.add(8);
//      numbers.add(9);
//      numbers.add(10);
//      numbers.add(11);
//      numbers.add(12);


      //determineSubsetEven
      if(numbers.containsAll(numbersEven)){
         System.out.println("NumbersEven is a subset of Numbers");
      }//if
      else{
         System.out.println("NumbersEven is not a subset of Numbers");
      }//else


      //determineSubsetOdd
      if(numbers.containsAll(numbersOdd)){
         System.out.println("NumbersOdd is a subset of Numbers");
      }//if
      else{
         System.out.println("NumbersOdd is not a subset of Numbers");
      }//else


   }//main
}//class
