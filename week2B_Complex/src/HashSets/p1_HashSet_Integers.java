package HashSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/****
 ***** Created by pcurr on 27/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p1_HashSet_Integers {
   public static void main(String[] args) {

       Set<Integer> valuesA = new HashSet<>();
       valuesA.add(24);
       valuesA.add(26);
       valuesA.add(28);
       valuesA.add(30);
       valuesA.add(32);

       Set<Integer> valuesB = new HashSet<>();
       valuesB.add(30);
       valuesB.add(32);
       valuesB.add(35);
       valuesB.add(40);
       valuesB.add(45);
       valuesB.add(50);

       //declare iterator
       Iterator<Integer> iteratorA = valuesA.iterator();

       //while loop to print
       while (iteratorA.hasNext()){
           int numA = iteratorA.next();
           System.out.println(numA);
       }//while

       valuesA.add(34);
       valuesB.add(34);

       Set<Integer> Union = new HashSet<>();
       Union.addAll(valuesA);
       Union.addAll(valuesB);
       System.out.println("The union is " + Union);

   }//main
}//class
