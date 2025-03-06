import java.io.*;

/****
 ***** Created by psd24cur on 06/03/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Read_Write_Search_STRING {
   public static void main(String[] args) {

      String filename = "xanadu.txt"; // replace with your file path
      String key = "stately"; // replace with the term you want to search for

      try {
         String[] items = readFile(filename);
//         Arrays.sort(items); // ensure the array is sorted before performing binary search

         int result = linearSearch(items, key);
         if (result != -1) {
            System.out.println("Found at index: " + result);
         } else {
            System.out.println("Not found.");
         }

      } catch (IOException e) {
         System.out.println("Error reading file: " + e.getMessage());
      }
   }


   public static String[] readFile(String filename) throws IOException {
      BufferedReader reader = new BufferedReader(new FileReader(filename));
      StringBuilder content = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null) {
         content.append(line).append(" "); // add a space to split the words
      }
      reader.close();
      return content.toString().split("\\s+"); // split by whitespace
   }

   public static int binarySearch(String[] items, String key){
      int left = 0, right = items.length - 1;

      while (left <= right){
         int pivot = (left + right)/2;
         if (key.compareTo(items[pivot]) == 0) {
            return pivot;//found
         } else if (key.compareTo(items[pivot]) > 0){
            left = pivot +1; //searchRight
         }//else
         else{
            right = pivot -1;//search left
         }
      }
      return -1;//not found
   }//binarySearch


   public static int linearSearch(String[] items, String key) {
      for (int i = 0; i < items.length; i++) {
         if (items[i].equals(key)) {
            return i; // found
         }
      }
      return -1;// not found
   }




}//class
