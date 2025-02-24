package week1B_ReaderWriterFilesIO.Practicals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/****
 ***** Created by psd24cur on 31/01/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class P1_WRITE_Fifty {

   public static void main(String[] args) throws IOException {

      final int MAX = 50;
      int[] data = new int[MAX];
      writeToFile(data, "fifty.txt");
   }

   public static void writeToFile(int[] nums, String fname) throws IOException {
      int total = 0;

      try {
         FileWriter fw = new FileWriter(fname);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
            pw.println(nums[i]);
         }//for

         pw.close();
         bw.close();
         fw.close();
      }//end
      catch (IOException e) {
         System.out.println(e);
      }
   }
}