package HashSets;

import java.util.HashSet;
import java.util.Set;

/****
 ***** Created by pcurr on 27/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p2_HashSet_Strings {
   public static void main(String[] args) {

      Set<String> Months1 = new HashSet<>();
      Months1.add("Jan");
      Months1.add("Feb");
      Months1.add("March");
      Months1.add("April");
      Months1.add("May");
      Months1.add("June");
      Set<String> Months2 = new HashSet<>();
      Months2.add("May");
      Months2.add("June");
      Months2.add("July");
      Months2.add("August");

      Set<String> Union = new HashSet<>();
      Union.addAll(Months1);
      Union.addAll(Months2);
      System.out.println("Union :" + Union);

      Set<String> Intersection = new HashSet<>();
      Intersection.addAll(Months1);
      Intersection.retainAll(Months2);;
      System.out.println("Intersection :" + Intersection);

      Months1.remove("May");
      Months1.remove("June");

      Set<String> Union2 = new HashSet<>();
      Union2.addAll(Months1);
      Union2.addAll(Months2);
      System.out.println("Union2 :" + Union2);

      Set<String> Intersection2 = new HashSet<>();
      Intersection2.addAll(Months1);
      Intersection2.retainAll(Months2);;
      System.out.println("Intersection2 :" + Intersection2);

      if (Intersection2.isEmpty())
         System.out.println("The intersection set is empty");
      else
         System.out.println("The intersection set is not empty");


   }//main
}//class
