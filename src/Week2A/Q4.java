package Week2A;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/****
 ***** Created by pcurr on 04/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class Q4 {
   public static void main(String[] args) {

      int [] arrayNum = new int[20];
      LinkedList <Integer> listNum = new LinkedList<>();

      try{
         FileReader fr = new FileReader("Random20.txt");
         BufferedReader br = new BufferedReader(fr);
         String readNumber = br.readLine();

         for(int i = 0; i < 20; i++){
            int x = Integer.parseInt(readNumber);
            arrayNum[i] = x;
            listNum.add(x);
            readNumber = br.readLine();
         }

         br.close();
         fr.close();

         //add value to Array
         int[] listArrayNew = new int [21];

         //set unaffected indexes to new array
         for (int i = 0; i<10; i++) {
            listArrayNew[i] = arrayNum[i];
         }

         //set value of index 10 to 21
         listArrayNew[10] = 21;

         //set remaining indexes and values
         for (int i = 11; i<21; i++){
            listArrayNew[i] = arrayNum[i-1];
         }

         //print array
         for(int j = 0; j<listArrayNew.length;j++) {
            System.out.println(listArrayNew[j]);
         }

         //add value to LinkedList
         listNum.add(10, 21);
         System.out.println(listNum);

      } catch (IOException e){
         System.out.println(e);
      }
   }
}
