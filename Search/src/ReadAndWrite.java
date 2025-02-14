import java.io.*;
import java.util.Arrays;

/****
 ***** Created by psd24cur on 14/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class ReadAndWrite {
   public static void main(String[] args) {

      writeNumbers();

      int[] numbersIn = readNumbers("100search.txt");

      System.out.println(Arrays.toString(numbersIn));

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

   public static void generateRandom(){
      int [] num = new int[100];
      int min = 1;
      int max = 100;

      for(int i = 0; i < num.length; i++){
         num[i] = (int)(Math.random() * (max - min + 1) + min);
      }//for
   }//generateRandom

   public static void writeNumbers(){
      try{
         FileWriter fw = new FileWriter("100search.txt");
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         for(int i = 1; i <=100; i++){
            pw.println(i);
         }//for
         bw.close();
         pw.close();
         fw.close();
      }//try
      catch (IOException e){
         System.out.println(e);
      }//catch
   }//writeNumbers

}//class
