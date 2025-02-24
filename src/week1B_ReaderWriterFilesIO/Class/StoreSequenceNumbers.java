package week1B_ReaderWriterFilesIO.Class;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/****
 ***** Created by psd24cur on 31/01/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class StoreSequenceNumbers {
   public static void main(String[] args) throws IOException {

      FileWriter fw = new FileWriter("test.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);

      for (int i = 1; i <=10; i++){
         pw.println(i);
      }//for

      pw.close(); bw.close();fw.close();

   }//main
}//class
