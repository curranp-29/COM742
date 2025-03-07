import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/****
 ***** Created by psd24cur on 28/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/

public class Read_Write_Search_Sort_Time_INT {
   public static void main(String[] args) throws IOException{

      //declare, read and populate NUMBERS
      ArrayList<Integer> number = readNumbersList("RandomNums.txt");

      //convert to array
      int[] array = convertListArray(number);
      System.out.println(Arrays.toString(array));

      long CurrentTime = System.nanoTime();

      //insertion sort
      insertionSort(array);

//      System.out.println(Arrays.toString(array));

      //findMin
      System.out.println("Min element: " + findMin(array));

      //findMax
      System.out.println("Max element: " + findMax(array));

      //bubble sort
      bubbleSortOptimised(array);
//      System.out.println(Arrays.toString(array));

      //selection sort
      selectionSort(array);
//      System.out.println(Arrays.toString(array));


      long CurrentTimeEnd = System.nanoTime();
      long Totaltime = CurrentTimeEnd - CurrentTime;
      System.out.println("Total time (ns): " + Totaltime);

      int key = 5;
      //linear search
      System.out.println("Key " + key + " found at position: " + linearSearch(array, 5));

      //print to file
      writeToFile(array, "testRandoms.txt");
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

   public static void writeListToFile(ArrayList<Integer> data, String filename) throws IOException {
      try{
         FileWriter fw = new FileWriter(filename);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         for(int i = 0; i < data.size(); i++) {
            pw.println(data.get(i));
         }//for

         pw.close();
         bw.close();
         fw.close();
      }//try
      catch (IOException e){
         System.out.println(e);
      }//catch
   }//writeToFile

   public static int [] readNumberKnownX (String filename){
      int[] array = new int[100];
      int readIn, i = 0;

      try{
         FileReader fr = new FileReader(filename);
         BufferedReader br = new BufferedReader(fr);

         //System.out.println(array.length);

         String in = br.readLine();

         while( in != null){
            readIn = Integer.parseInt(in);
            array[i] = readIn;
            i++;
            in = br.readLine();
         }//while

         br.close();
         fr.close();
      }//try
      catch(IOException e){
         System.out.println(e);
      }//catch
      return array;
   }//readNumbers

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

   public static void writeToFile(String[] data, String filename) throws IOException{
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

   public static void bubbleSortOptimised(int[] data) {
      int swapBS1 = 0, comparisonBS1 = 0;
      boolean swapped = true;

      for (int out = data.length-1; out > 0; out--) {
         swapped = false;
         for (int in = 0; in < out; in++) {
            comparisonBS1++;
            if (data[in] > data[in + 1]) {
               swapped = true;
               int tmp = data[in];        // swap items
               data[in] = data[in + 1];    //
               data[in + 1] = tmp;        //
               swapBS1++;
            }
         }
         for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
         System.out.println();
         if (swapped == false)
            out = 0;
      }
      System.out.println("swapsBS=" + swapBS1 + ", ComparisonsBS= " + comparisonBS1);
   }//bubbleSortOptimised

   public static int linearSearch(int [] array, int key){
      int comparisons = 0;
      //iterate over each element in array
      for(int i = 0; i < array.length; i++){
         comparisons++;
         if(key == array[i]){
            System.out.println("ComparisonsLS: " + comparisons);
            return i;//found so return position
         }//if
      }//for
      System.out.println("ComparisonsLS: " + comparisons);
      return -1;
   }//LinearSearch





   public static void insertionSort( int data[] ) {
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
   }

   public static void selectionSort(int data[]) {
      int in, out, min;
      int comparisonSS = 0, swapSS = 0;
      for (out=0; out < data.length-1; out++) {
         min = out;
         for (in = out+1; in < data.length; in++) {
            comparisonSS++;
            if (data[in] < data[min]) {
               min = in;
               swapSS++;          // new minimum
            }
         }
         int tmp = data[out];     // swap items
         data[out] = data[min];   //
         data[min] = tmp;       //
      }
      System.out.println("swapsSS=" + swapSS + ", ComparisonsSS= " + comparisonSS);
   }

   public static int findMin(int [] num){
      int min = num[0];

      for(int i = 0; i < num.length; i++){
         if(num[i] < min){
            min = num[i];
         }//if
      }//for
      return min;
   }//findMin

   public static int findMax(int [] num){
      int max = num[0];
      for(int i = 0; i < num.length; i++){
         if(num[i] > max){
            max = num[i];
         }//if
      }//for
      return max;
   }//findMin

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

}//class
