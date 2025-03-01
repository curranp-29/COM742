import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/****
 ***** Created by pcurr on 01/03/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class Sorts {
   public static void main(String[] args) {

      int [] numbers = new int[] {2,5,9,3,13,1,16,7,8,15,4,6};

      System.out.println(Arrays.toString(numbers));

      bubbleSort(numbers);

      System.out.println(Arrays.toString(numbers));

      //declare, read and populate array lists
      ArrayList<Integer> a1 = readNumbersList("File1.txt");
      ArrayList<Integer> a2 = readNumbersList("File2.txt");
      ArrayList<Integer> a3 = readNumbersList("RandomNums.txt");

      //convert to arrays
      int[] numbers1 = convertListArray(a1);
      int[] numbers2 = convertListArray(a2);
      int[] numbers3 = convertListArray(a3);

      //used to get the current time in MS
      long bubbleTime = System.nanoTime();
      bubbleSort(numbers1);
      long bubbleTimeEnd = System.nanoTime();
      long bubbleTotal = bubbleTimeEnd - bubbleTime;
      System.out.println("List 1 Sorted (ns): " + bubbleTotal);


      bubbleTime = System.nanoTime();
      bubbleSort(numbers2);
      bubbleTimeEnd = System.nanoTime();
      bubbleTotal = bubbleTimeEnd - bubbleTime;
      System.out.println("List 2 Reverse (ns): " + bubbleTotal);

      bubbleTime = System.nanoTime();
      bubbleSort(numbers3);
      bubbleTimeEnd = System.nanoTime();
      bubbleTotal = bubbleTimeEnd - bubbleTime;
      System.out.println("List 3 Random (ns): " + bubbleTotal);


   }//main


   public static ArrayList<Integer> readNumbersList(String filename) {
      ArrayList<Integer> elementsList = new ArrayList<>();
      int readIn;

      try {
         FileReader fr = new FileReader(filename);
         BufferedReader br = new BufferedReader(fr);

         String in = br.readLine();

         while (in != null) {
            readIn = Integer.parseInt(in);
            elementsList.add(readIn);
            in = br.readLine();
         }

         br.close();
         fr.close();
      } catch (IOException e) {
         System.out.println(e);
      }

      return elementsList;
   }//readNumbers


   public static int[] convertListArray(ArrayList<Integer> list){
      // Convert ArrayList to int[]
      int[] array = new int[list.size()];
      for (int i = 0; i < list.size(); i++) {
         array[i] = list.get(i);
      }
      return array;
   }//convertListArray

   public static void bubbleSort(int[] data){
      int swapBS1 = 0, comparisonBS1 = 0;
      boolean swapped = true;

      for (int out = data.length - 1; out > 0; out--) {
         swapped = false;
         for (int in = 0; in < out; in++) {
            comparisonBS1++;
            if (data[in] > data[in + 1]) {
               swapped = true;
               int tmp = data[in];
               data[in] = data[in + 1];
               data[in + 1] = tmp;
               swapBS1++;
            }//if
         }//for

//            for (int i = 0; i < data.length; i++) {
//                System.out.print(data[i] + " ");
//            }//for
//            System.out.println();

         if (swapped == false) {
            out = 0;
         }
      }
      System.out.println("Swaps: " + swapBS1);
      System.out.println("Comparisons: " + comparisonBS1);
   }//bubbleSort

}//class
