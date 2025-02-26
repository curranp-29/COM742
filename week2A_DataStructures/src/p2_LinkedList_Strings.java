import java.util.Collections;
import java.util.LinkedList;

/****
 ***** Created by pcurr on 26/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p2_LinkedList_Strings {
   public static void main(String[] args) {

      //declare list
      LinkedList<String> StrList = new LinkedList<>();

      //populate list
      StrList.add("Mary");
      StrList.add("John");
      StrList.add("Peter");
      StrList.add("Shane");
      StrList.add("Sheamus");
      StrList.add("James");
      System.out.println(StrList);

      //create subList elements 1-4
      StrList.subList(1,4);
      System.out.println(StrList.subList(1,4));

      //reverse list
      Collections.reverse(StrList);
      System.out.println(StrList);

      //sort list
      Collections.sort(StrList);
      System.out.println(StrList);

      //create new list
      LinkedList<String> CopyStrList = new LinkedList<>();

      //copy StrList to CopyStrlist
      CopyStrList.addAll(StrList);
      System.out.println(CopyStrList);

      Collections.shuffle(CopyStrList);
      System.out.println(CopyStrList);

      int index = CopyStrList.indexOf("Shane");
      System.out.println("Shane found at index: " + index);

   }//main
}//class
