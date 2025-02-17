package Week2B_ComplexDataStructures.Hash;

import java.util.HashSet;
import java.util.Set;

/****
 ***** Created by psd24cur on 07/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Q2_Hash {
   public static void main(String[] args) {

      Set<String> valuesA = new HashSet<>();
      Set<String> valuesB = new HashSet<>();

      valuesA.add("Jan");
      valuesA.add("Feb");
      valuesA.add("March");
      valuesA.add("April");
      valuesA.add("May");
      valuesA.add("June");

      valuesB.add("May");
      valuesB.add("June");
      valuesB.add("July");
      valuesB.add("August");

      //Union
      Set<String> Union = new HashSet<String>();
      Union.addAll(valuesA);
      Union.addAll(valuesB);
      System.out.println("Union: " + Union);

      Set<String> Intersection = new HashSet<String>();
      Intersection.addAll(valuesA);
      Intersection.retainAll(valuesB);
      System.out.println("Intersection: " + Intersection);
      System.out.println("Intersection size: " + Intersection.size());

      valuesA.remove("May");
      valuesA.remove("June");

      //Union
      Set<String> Union2 = new HashSet<String>();
      Union2.addAll(valuesA);
      Union2.addAll(valuesB);
      System.out.println("Union: " + Union);

      Set<String> Intersection2 = new HashSet<String>();
      Intersection2.addAll(valuesA);
      Intersection2.retainAll(valuesB);
      System.out.println("Intersection: " + Intersection2);
      System.out.println("Intersection size: " + Intersection2.size());

      if(Intersection2.isEmpty()){
         System.out.println("Intersection set is empty");
      }//if
      else{
         System.out.println("Intersection set is not empty");
      }


   }//main
}//class
