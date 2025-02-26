import java.util.LinkedList;

/****
 ***** Created by pcurr on 26/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p1_LinkedList_Integers {
   public static void main(String[] args) {

      //declare and populate List1
      LinkedList<Integer> numList = new LinkedList<>();
      numList.add(2);
      numList.add(4);
      numList.add(8);
      numList.add(16);
      numList.add(32);
      numList.add(64);
      System.out.println(numList);

      //add to end
      numList.addLast(128);
      System.out.println(numList);

      //declare and populate List2
      LinkedList<Integer> numbers = new LinkedList<>();
      numbers.add(3);
      numbers.add(6);
      numbers.add(9);
      numbers.add(12);
      System.out.println(numbers);

      //add numbers to numList at position 3
      numList.addAll(3, numbers);
      System.out.println(numList);

      //determine which element at position 5
      System.out.println("Position 5: " + numList.get(5));

      //replace position 6 with 23
      numList.set(6, 23);
      System.out.println(numList);

      //remove value 16 from set
      numList.remove(Integer.valueOf(16));
      System.out.println(numList);

      //print each element on new line
//      for (int i = 0; i < numList.size() -1 ; i++){
//         System.out.println(numList.get(i));
//      }//for

      //alternatively print
      numList.forEach(s -> System.out.println(s));

   }//main
}//class
