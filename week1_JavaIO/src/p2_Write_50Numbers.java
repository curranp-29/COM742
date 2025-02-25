import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/****
 ***** Created by pcurr on 25/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p2_Write_50Numbers {
   public static void main(String[] args) throws IOException{

      final int MAX = 50;
      int[] numbers = new int[MAX];

      writeFile("NewFifty.txt", numbers);

   }//main

   public static void writeFile(String fileName, int [] numbers) throws IOException{
      try{
         FileWriter fw = new FileWriter(fileName);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            pw.println(numbers[i]);
         }//for
         pw.close();
         bw.close();
         fw.close();
      }//try
      catch (IOException e){
         System.out.println(e);
      }//catch
   }//writeFile


}//class
