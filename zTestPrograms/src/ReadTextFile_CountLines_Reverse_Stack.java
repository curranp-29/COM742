import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

/****
 ***** Created by pcurr on 06/03/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class ReadTextFile_CountLines_Reverse_Stack {

   public static void main(String[] args) {

      {
         // File path (adjust this to the path of your file)
         String filePath = "Xanadu.txt";

         // Stack to store lines
         Stack<String> lines = new Stack<>();
         int lineCount = 0;

         try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read lines and push them onto the stack
            while ((line = br.readLine()) != null) {
               lines.push(line);
               lineCount++;
            }

            System.out.println("Total lines: " + lineCount);
            System.out.println("Reversed content:");

            // Pop lines off the stack and print them in reverse order
            while (!lines.isEmpty()) {
               System.out.println(lines.pop());
            }

         } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());

         }
      }
   }//main
}//class