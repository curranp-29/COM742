package Useful_Methods;

import java.io.*;

/****
 ***** Created by psd24cur on 28/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Read_Write {
   public static void main(String[] args) {

   }//main

   public static int [] readNumbers (String filename){

      int[] array = new int[100];
      int readIn, i = 0;

      try{
         FileReader fr = new FileReader(filename);
         BufferedReader br = new BufferedReader(fr);

         //System.out.println(array.length);

         String in = br.readLine();

         while( in != null){
            readIn = Integer.parseInt(in);
            array[i] = readIn;
            i++;
            in = br.readLine();
         }//while

         br.close();
         fr.close();
      }//try
      catch(IOException e){
         System.out.println(e);
      }//catch
      return array;
   }//readNumbers

   public static void writeToFile(int[] data, String filename) throws IOException {
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
