import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/****
 ***** Created by pcurr on 26/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p4_Array_LinkedList {
   public static void main(String[] args) throws IOException {

      int[] listArray = new int [20];

      LinkedList<Integer> listLink = new LinkedList<>();

      try {
         FileReader fr = new FileReader("twenty.txt");
         BufferedReader br = new BufferedReader(fr);
         String readNumber = br.readLine();

         for (int i = 0; i < 20; i++)
         {
            //System.out.println(readNumber);
            int x = Integer.parseInt(readNumber);
            listArray[i]=x;
            listLink.add(x);
            readNumber = br.readLine();
         }//for
         br.close();
         fr.close();
      }//try
      catch (IOException e) {
         System.out.println(e);
      }//catch

      int[] listArrayNew = new int [21];

      for (int i = 0; i<10; i++) {
         listArrayNew[i] = listArray[i];
      }//for
      listArrayNew[10] = 21;

      for (int i = 11; i<21; i++){
         listArrayNew[i] = listArray[i-1];
      }//for

      for(int j = 0; j<listArrayNew.length;j++) {
         System.out.println(listArrayNew[j]);
      }//for

      listLink.add(10, 21);
      System.out.println(listLink);
   }//main
}//class
