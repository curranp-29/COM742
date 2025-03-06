import java.io.*;
import java.util.*;

/****
 ***** Created by pcurr on 05/03/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class RandomWriteReadArraySortMinMaxMode {
   public static void main(String[] args) throws IOException {

      //create array of random nums
      int [] numbers  = generateRandom();

      //print new array
      System.out.println(Arrays.toString(numbers));

      //write array to .txt file
      writeToFile(numbers, "createdRandomNums.txt");

      //read file into arraylist
      ArrayList<Integer> number = readNumbersList("createdRandomNums.txt");

      //convert to array
      int[] numbersToSort = convertListArray(number);

      //insertionSort and Captures SwapsCopies
      int[]swapsCopies = insertionSort(numbersToSort);

      //findMinMax
      int[]minMax = findMaxMin(numbersToSort);

      //findMode
      int mode  = findMode(numbersToSort);

      //writeMinMaxMode to file
      writeStatsToFile(numbers, "createdRandomNums.txt", minMax[0], minMax[1], mode, swapsCopies[0], swapsCopies[1]);

   }//main

   public static int [] generateRandom(){
      int [] num = new int[100];
      int min = 1;
      int max = 100;

      for(int i = 0; i < num.length; i++){
         num[i] = (int)(Math.random() * (max - min + 1) + min);
      }//for
      return num;
   }//generateRandom



   public static void writeToFile(int[] data, String filename) throws IOException {
      try{
         FileWriter fw = new FileWriter(filename);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);


         for(int i = 0; i < data.length; i++) {
            pw.println(data[i]);
         }//for

         pw.close();
         bw.close();
         fw.close();
      }//try
      catch (IOException e){
         System.out.println(e);
      }//catch
   }//writeToFile


   public static void writeStatsToFile(int[] data, String filename, int  min, int max, int mode, int swaps, int copies) throws IOException {
      try{
         FileWriter fw = new FileWriter(filename);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         pw.println("Max value: " + max);
         pw.println("Min value: " + min);
         pw.println("Mode: " + mode);
         pw.println("Swaps: " + swaps);
         pw.println("Copies: " + copies);

         for(int i = 0; i < data.length; i++) {
            pw.println(data[i]);
         }//for

         pw.close();
         bw.close();
         fw.close();
      }//try
      catch (IOException e){
         System.out.println(e);
      }//catch
   }//writeToFile




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

   // Method to find the mode in an array
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


}//class
