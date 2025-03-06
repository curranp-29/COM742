package Class;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/****
 ***** Created by psd24cur on 31/01/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class WriteFile_ReusableMethod {

   public static void main(String[] args) throws IOException {

      int[] data = {23, 34, 27, 89, 45, 67};
      writeToFile(data, "number.txt");
   }

   public static void writeToFile(int[] nums, String fname) throws IOException {
      int total = 0;

      try {
         FileWriter fw = new FileWriter(fname);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         for (int i = 0; i < nums.length; i++) {
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