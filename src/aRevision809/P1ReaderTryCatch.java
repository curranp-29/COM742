package aRevision809;

import java.io.*;
import java.util.Scanner;

/****
 ***** Created by pcurr on 01/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class P1ReaderTryCatch {

   static FileReader myfileName;
   static Scanner readMyFile;

   public static void main(String[] args) {

      try{
         myfileName = new FileReader("Xanadu.txt");
         readMyFile = new Scanner(myfileName);

         while (readMyFile.hasNextLine()){
            System.out.println(readMyFile.nextLine());
         }//while

         myfileName.close();
         readMyFile.close();

      }//try

      catch(FileNotFoundException e){
         System.out.println("Cannot open input file");
         System.out.println(e.getMessage());
      }//catch

      catch(IOException e){
         System.out.println("Error Closing File");
         System.out.println(e.getMessage());
      }//catch

   }//main
}//class
