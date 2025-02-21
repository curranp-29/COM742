package Week1A_Recap.JavaAdvanced;

import java.util.Scanner;

/****
 ***** Created by pcurr on 28/01/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class P5Palindrome {
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.print("Please enter a value: ");
       String value = scanner.nextLine();

       if(isPalindrome(value)){
           System.out.println("Value " + value + " is a palindrome");
       }//if

       else{
           System.out.println("Value " + value + " is not a palindrome");
       }//else

       scanner.close();
   }//main


    static boolean isPalindrome(String str){
       str = str.toLowerCase();
       int left = 0;
       int right = str.length()-1;

       while (left < right){
           if(str.charAt(left) != str.charAt(right)){
               return false;
           }
           left++;
           right--;
       }//while
       return true;
    }//method

}//class
