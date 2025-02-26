import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/****
 ***** Created by pcurr on 26/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p3_LinkedList_Methods {
   public static void main(String[] args) {

      //declare list and populate with random using method
      LinkedList<Integer> listNum = populateRandom(20);
      System.out.println(listNum);

      //declare list2
      LinkedList<Integer> copyListNum = new LinkedList<>();

      //copy list to list2
      copyListNum.addAll(listNum);
      System.out.println(copyListNum);

      //add 16 to start
      copyListNum.addFirst(16);
      //add 24 to end
      copyListNum.addLast( 24);
      System.out.println(copyListNum);

      //find first occurrence of 6
      if(copyListNum.contains(6)){
         System.out.println("First occurrence of 6: " + copyListNum.indexOf(6));
      }//if

      else{
         System.out.println("Element does not exist");
      }//else

      //find last occurrence of 15
      copyListNum.indexOf(15);

      if(copyListNum.contains(15)){
         System.out.println("Last occurrence if 15: " + copyListNum.lastIndexOf(15));
      }//if
      else{
         System.out.println("Element does not exist");
      }//else


      //print each element on list
      for(int i = 0; i<listNum.size(); i++){
         System.out.println ("The value at position " + i + " is " +listNum.get(i));
      }

      //alternatively print
//      copyListNum.forEach(s -> System.out.println(s + "\t Index: " + copyListNum.indexOf(s)));

      //remove first
      copyListNum.removeFirst();
      //remove last
      copyListNum.removeLast();
      //remove element 4
      copyListNum.remove(4);

      System.out.println(copyListNum);

      //swap positions 3 and 16
      Collections.swap(copyListNum, 3, 16);
      System.out.println(copyListNum);

      //declare list3 and populate randomly
      LinkedList<Integer> ListNum2 = populateRandom(6);
      //copy into listNum
      listNum.addAll(ListNum2);
      System.out.println(listNum);


      //call method
      int value = findRemoveReturnFirst(listNum);
      System.out.println("Value at index 0: " + value);

      if (listNum.contains(32))
         System.out.println("32 exists in the list");
      else
         System.out.println("There is no such element");

      if (listNum.isEmpty())
         System.out.println("This list is empty");
      else
         System.out.println("This list contains values");

   }//main



   public static LinkedList<Integer> populateRandom(int size){
      //declare list
      LinkedList<Integer> list = new LinkedList<>();

      //create random object
      Random random = new Random();

      //populate list with random number 1-100
      for(int i = 0; i < size; i++){
         list.add(random.nextInt(100)+1);
      }//for
      return list;
   }

   public static int findRemoveReturnFirst(LinkedList<Integer> list){
      int value = list.get(0);
      list.remove(value);
      return value;
   }//findRemoveReturnFirst




}//class
