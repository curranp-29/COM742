package Week1A_Recap.JavaAdvanced;

import java.util.Scanner;

/****
 ***** Created by pcurr on 28/01/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class P8Roman {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = scanner.nextInt();
      System.out.println("Roman numeral: " + intToRoman(num));
   }

   public static String intToRoman(int num) {
      String[] thousands = {"", "M", "MM", "MMM"};
      String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

      String roman = thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
      return roman;
   }//main
}//class