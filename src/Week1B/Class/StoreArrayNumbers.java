package Week1B.Class;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/****
 ***** Created by psd24cur on 31/01/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class StoreArrayNumbers {
   public static void main(String[] args) throws IOException {

      int[] nums = {2,4,7,12,67,2};

      FileWriter fw = new FileWriter("test2.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);

      for (int i =0; i<nums.length; i++){
         pw.println(nums[i]);
      }//for

      pw.close();bw.close();fw.close();

   }//main
}//class
