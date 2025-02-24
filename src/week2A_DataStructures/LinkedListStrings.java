package week2A_DataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListStrings {

    public static void main(String[] args) {

        //LinkedList
        LinkedList<String> strList = new LinkedList<>();

        //add
        strList.add("Mary");
        strList.add("John");
        strList.add("Peter");
        strList.add("Shane");
        strList.add("Sheamus");
        strList.add("James");

        //Print LinkedList
        System.out.println(strList);

        //Create Sublist-Must be a List not a LinkedList
        List<String> subList = strList.subList(1,4);
        System.out.println(subList);

        //Reverse
        Collections.reverse(strList);
        System.out.println(strList);

        //Sort
        Collections.sort(strList);
        System.out.println(strList);

        LinkedList<String> CopyStrList = new LinkedList<>(strList);
        CopyStrList.add("Mary");
        CopyStrList.add("Mary");
        CopyStrList.add("Mary");
        CopyStrList.add("Mary");
        CopyStrList.add("Mary");
        CopyStrList.add("Mary");

        //Copy
        Collections.copy(CopyStrList, strList);
        System.out.println(CopyStrList);

        //Shuffle
        Collections.shuffle(CopyStrList);
        System.out.println(CopyStrList);

        //Search for value
        if(CopyStrList.contains("Shane")){
            System.out.println("Element found at " + CopyStrList.indexOf("Shane"));
        }//if
        else{
            System.out.println("No such element");
        }//else

    }//main
}//class
