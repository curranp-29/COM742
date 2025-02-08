package Week2B.Hash;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/****
 ***** Created by pcurr on 08/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class Q5_Hash {
   public static void main(String[] args) {

      try{

         FileReader frA = new FileReader("NumbersA.txt");
         BufferedReader brA = new BufferedReader(frA);

         FileReader frB = new FileReader("NumbersB.txt");
         BufferedReader brB = new BufferedReader(frB);

         String valueA = brA.readLine();
         String valueB = brB.readLine();

         Set<Integer> NumbersA = new HashSet<>();
         Set<Integer> NumbersB = new HashSet<>();

         while(valueA != null){
            int newValue = Integer.parseInt(valueA);
            NumbersA.add(newValue);
            valueA = brA.readLine();
         }//while

         System.out.println(NumbersA);

         while(valueB != null){
            int newValue = Integer.parseInt(valueB);
            NumbersB.add(newValue);
            valueB = brB.readLine();
         }//while

         System.out.println(NumbersB);

         //Union
         Set<Integer> Union = new HashSet<>();
         Union.addAll(NumbersA);
         Union.addAll(NumbersB);
         System.out.println("Union: " + Union);


         Set<Integer> Intersection = new HashSet<>();
         Intersection.addAll(NumbersA);
         Intersection.retainAll(NumbersB);
         System.out.println("Intersection: " + Intersection);

         System.out.println("Union contains 10: " + Union.contains(10));

      }

      catch (IOException e) {
         System.out.println(e);
      }



   }//main
}//class
