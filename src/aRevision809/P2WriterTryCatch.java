package aRevision809;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/****
 ***** Created by pcurr on 01/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class P2WriterTryCatch {
   public static void main(String[] args) {

      PrintWriter myOutputFile;
      String outputFileName = "outputbasictest.txt";

      try{
         myOutputFile = new PrintWriter(outputFileName);
         myOutputFile.print("TEST TEST TEST");
         myOutputFile.close();
      }//try

      catch(FileNotFoundException e){
         System.out.println("Error opening the file");
         System.out.println(e.getMessage());
      }//catch

      catch (Exception e){
         System.out.println(e.getMessage());
      }//catch


   }//main
}//class
