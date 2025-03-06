package Class; /****
 ***** Created by psd24cur on 31/01/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile_CopyCharacters {
   public static void main(String[] args) throws IOException {
      FileReader inputStream = null;
      FileWriter outputStream = null;
      try {
         inputStream = new FileReader("Xanadu.txt");
         outputStream = new FileWriter("Characteroutput.txt");
         int c;
         while ((c = inputStream.read()) != -1) {
            outputStream.write(c);
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
