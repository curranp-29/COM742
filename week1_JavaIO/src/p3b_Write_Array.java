import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/****
 ***** Created by pcurr on 25/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p3b_Write_Array {
   public static void main(String[] args) throws IOException{

      int[] numbers = new int[] {1,2,3,4,5};
      String[] strings = new String [] {"One", "Two", "Three", "Four", "Five"};

      writeToFile(numbers, "testnumbers.txt");
      writeToFile(strings, "teststring.txt");


   }//main

   public static void writeToFile(int[] data, String filename) throws IOException{
      try{
         FileWriter fw = new FileWriter(filename);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         for(int i = 0; i < data.length; i++) {
            pw.println(data[i]);
         }//for

         pw.close();
         bw.close();
         fw.close();
      }//try
      catch (IOException e){
         System.out.println(e);
      }//catch
   }//writeToFile

   public static void writeToFile(String[] data, String filename) throws IOException{
      try{
         FileWriter fw = new FileWriter(filename);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         for(int i = 0; i < data.length; i++) {
            pw.println(data[i]);
         }//for

         pw.close();
         bw.close();
         fw.close();
      }//try
      catch (IOException e){
         System.out.println(e);
      }//catch
   }//writeToFile



}//class
