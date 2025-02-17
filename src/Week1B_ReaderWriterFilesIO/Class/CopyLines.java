package Week1B_ReaderWriterFilesIO.Class; /****
 ***** Created by psd24cur on 31/01/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/

import java.io.*;

public class CopyLines {
      public static void main(String[] args) throws IOException {
         BufferedReader inputStream = null;
         PrintWriter outputStream = null;
         try {
            inputStream = new BufferedReader(new FileReader("Xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("Characteroutput.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
               outputStream.println(l);
            }
         } finally {
            if (inputStream != null) {
               inputStream.close();
            }
            if (outputStream != null) {
               outputStream.close();
            }
         }
      }
   }
