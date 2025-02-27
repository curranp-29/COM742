package HashSets;

import java.util.HashSet;
import java.util.Set;

/****
 ***** Created by pcurr on 27/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p4_Array_HashSet_ForLoop {
   public static void main(String[] args) {

      int Numbers[] = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
      Set<Integer> s = new HashSet<Integer>();
      for(int i = 0; i < 10; i++) {
         s.add(Numbers[i]);
      }
      System.out.println("S="+ s);

      Set<Integer> multiply = new HashSet<Integer>();
      for(int i = 0; i < 10; i++) {
         multiply.add(Numbers[i]*3);
      }
      System.out.println("New set="+ multiply);

   }//main
}//class
