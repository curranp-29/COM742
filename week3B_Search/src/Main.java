import java.util.Arrays;

/****
 ***** Created by psd24cur on 14/02/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/

public class Main {
   public static void main(String[] args) {

      int [] data = ReadAndWrite.readNumbers("100search.txt");
      int key = 75;

      //INITIALISE ARRAY
//      int[] data = {2, 5, 9, 3, 13, 1, 16, 7, 8, 15, 4, 6};

//      int[] data = ReadAndWrite.generateRandom(1000);
//      ReadAndWrite.writeNumbers("1000.txt", data);

      //LINEAR SEARCH
      long CurrentTime = System.nanoTime(); //used to get the current time in NS
      System.out.println(Arrays.toString(data));
      int positionL = LinearSearch.linearSearch(data, key);
      System.out.println("Position of Key: " + key + " is position " + positionL );
      long CurrentTimeEnd = System.nanoTime();
      long Totaltime = CurrentTimeEnd - CurrentTime;
      System.out.println("Total time: " + Totaltime);

      //BINARY SEARCH
      CurrentTime = System.nanoTime(); //used to get the current time in NS
      Arrays.sort(data);
      int positionB = BinarySearch.binarySearch(data, key);
      System.out.println("Position of Key: " + key + " is position " + positionB );
      CurrentTimeEnd = System.nanoTime();
      Totaltime = CurrentTimeEnd - CurrentTime;
      System.out.println("Total time: " + Totaltime);

      }//main
   }//class