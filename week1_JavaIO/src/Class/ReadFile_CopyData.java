package Class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/****
 ***** Created by psd24cur on 31/01/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class ReadFile_CopyData {
   public static void main(String[] args) throws IOException {

      int total = 0;

      try{
         FileReader fr = new FileReader("data.txt");
         BufferedReader br = new BufferedReader(fr);

         String c = br.readLine();
         while (c != null){
            total+= Integer.parseInt(c);
            c = br.readLine();
         }

         br.close();
         fr.close();
         System.out.println("Total is " + total);
      } catch (IOException e){
         System.out.println(e);
      }
   }
}
