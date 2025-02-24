/****
 ***** Created by psd24cur on 21/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class StringReversal {
   public static void main(String[] args) {

      String input = "cats";
      String reversed = reverseString(input);
      System.out.println("Reversed: " + reversed);
   }//main

   public static String reverseString(String s){
      if(s.isEmpty()){
         return "";
      }
      return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() -1));
   }//recursiveMethod

}//class
