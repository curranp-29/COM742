import java.util.LinkedList;

/****
 ***** Created by pcurr on 26/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p5_FILO_stack {
   public static void main(String[] args) {

      LinkedList<Integer> stack = new LinkedList<>();

      stack.push(5);
      stack.push(10);
      stack.push(15);

      System.out.println(stack);

      stack.pop();
      System.out.println(stack);

   }//main

   public LinkedList<Integer> push(LinkedList<Integer> list, int value){
      list.add(0, value);
      return list;
   }

   public LinkedList<Integer> pop(LinkedList<Integer> x) {
      x.remove(0);
      return x;
   }

}//class
