import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/****
 ***** Created by pcurr on 06/03/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class Practice1 {
   public static void main(String[] args) throws IOException {

      //read input as ArrayList
      ArrayList<Integer> listNum = readNumbersList("Comparing.txt");

      //convert to Array
      int [] numbers = convertListArray(listNum);

      //capture current time NS to time sort
      long CurrentTime = System.nanoTime();
      //sort
      int [] isSwapsCopies = insertionSort(numbers);
      long CurrentTimeEnd = System.nanoTime();
      long TotaltimeSort = CurrentTimeEnd - CurrentTime;
      System.out.println("Total time Sort (ns): " + TotaltimeSort);

      int [] maxMin = findMaxMin(numbers);

      //time search
      CurrentTime = System.nanoTime();
      int key = binarySearch(numbers, 147);
      CurrentTimeEnd = System.nanoTime();
      long TotaltimeSearch = CurrentTimeEnd - CurrentTime;
      System.out.println("Total time Search (ns): " + TotaltimeSearch);

      //findMode
      int mode = findMode(numbers);

      //writeToFile
      writeStatsToFile("ComparingOutput.txt", maxMin[0], maxMin[1], mode, TotaltimeSort, isSwapsCopies[0], isSwapsCopies[1], TotaltimeSearch, key);


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
   }


   public static int[] convertListArray(ArrayList<Integer> list){
      // Convert ArrayList to int[]
      int[] array = new int[list.size()];
      for (int i = 0; i < list.size(); i++) {
         array[i] = list.get(i);
      }
      return array;
   }//convertListArray


   public static int[]  insertionSort( int data[] ) {
      int in, out, temp;
      int copies = 0, swapIS = 0;
      for (out=1; out < data.length; out++) {
         temp = data[out];
         copies++;
         for (in=out; in > 0 && data[in-1] >= temp; in--) {
            data[in] = data[in-1];
            swapIS++;
         }
         data[in] = temp;
      }
      System.out.println("swapsIS=" + swapIS + ", CopiesIS= " + copies);
      return new int[] {swapIS, copies};
   }


   public static int[] findMaxMin(int[] numbers){
      int max = numbers [0];
      int min = numbers [0];

      for(int index = 0; index < numbers.length; index++){
         if(numbers[index] > max){
            max = numbers[index];
         }//if
         if(numbers[index] < min){
            min = numbers[index];
         }//if
      }//for
      System.out.println("Max value in array is: " + max);
      System.out.println("Min value in array is: " + min);
      return new int[]{min,max};
   }//findMax


   public static int binarySearch( int[] array, int key) {
      int comparisons = 0;
      int left = 0, right = array.length - 1;//left and right values

      while (left <= right) {
         int pivot = (left + right) / 2;//pivot
         if (key == array[pivot]) {
            System.out.println("Comparisons: " + comparisons);
            return pivot;//found
         }//if
         else if (key > array[pivot]) {
            left = pivot + 1;
            comparisons++;
         }//else if
         else {
            right = pivot - 1;
            comparisons++;
         }//else
      }
      System.out.println("Comparisons: " + comparisons);
      return -1;//not found so return -1
   }


   public static int findMode(int[] array) {
      HashMap<Integer, Integer> frequencyMap = new HashMap<>();

      // Count the frequency of each element
      for (int value : array) {
         frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
      }

      // Find the element with the highest frequency
      int mode = array[0];
      int maxCount = 0;

      for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
         if (entry.getValue() > maxCount) {
            maxCount = entry.getValue();
            mode = entry.getKey();
         }
      }
      System.out.println("Mode: " + mode);
      return mode;
   }//findMode


   public static void writeStatsToFile(String filename, int  min, int max, int mode, long timeSort, int swaps, int copies, long timeSearch, int key) throws IOException {
      try{
         FileWriter fw = new FileWriter(filename);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         pw.println("Max value: " + max);
         pw.println("Min value: " + min);
         pw.println("Mode: " + mode);
         pw.println("SortSwaps: " + swaps);
         pw.println("SortCopies: " + copies);
         pw.println("SortTime: " + timeSort + " ns");
         pw.println("SearchTime: " + timeSearch + " ns to find key: " + key);

         pw.close();
         bw.close();
         fw.close();
      }//try
      catch (IOException e){
         System.out.println(e);
      }//catch
   }//writeToFile

}//class
