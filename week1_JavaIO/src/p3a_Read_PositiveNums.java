import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/****
 ***** Created by pcurr on 25/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p3a_Read_PositiveNums {
   public static void main(String[] args) throws IOException{

      System.out.println(countPositiveNumbers("positivenumbers.txt"));

   }//main

   public static int countPositiveNumbers(String filename) throws IOException {

      int count = 0, num;

      try {
         FileReader fr = new FileReader(filename);
         BufferedReader br = new BufferedReader(fr);

         String c = br.readLine();

         while (c != null) {
            num = Integer.parseInt(c);

            if (num > 0) {
               count++;
            }//if
            c = br.readLine();
         }//while

         br.close();
         fr.close();

         System.out.println("Total Positive: " + count);

      } catch (IOException e) {
         System.out.println(e);
      }//catch

      return count;
   }

}//class
