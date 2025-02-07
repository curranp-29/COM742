package Week2B.Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/****
 ***** Created by psd24cur on 07/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Q1_Hash {
   public static void main(String[] args) {

      Set<Integer> valuesA = new HashSet<>();
      valuesA.add(24);
      //deliberate duplicate value
      valuesA.add(24);
      valuesA.add(26);
      valuesA.add(28);
      valuesA.add(30);

      Set<Integer> valuesB = new HashSet<>();
      valuesB.add(30);
      valuesB.add(31);
      valuesB.add(35);
      valuesB.add(40);
      valuesB.add(45);
      valuesB.add(50);

      //addValueToSet
      valuesA.add(34);
      valuesB.add(34);

      //IteratorA
      Iterator<Integer> iteratorA = valuesA.iterator();
      while (iteratorA.hasNext()){
         int numA = iteratorA.next();
         System.out.println(numA);
      }


      //IteratorB
      Iterator<Integer> iteratorB = valuesB.iterator();
      while (iteratorB.hasNext()){
         int numB = iteratorB.next();
         System.out.println(numB);
      }

      //Union
      Set<Integer> Union = new HashSet<Integer>();
      Union.addAll(valuesA);
      Union.addAll(valuesB);
      System.out.println("Union: " + Union);


   }//main
}//class
