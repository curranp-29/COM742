import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/****
 ***** Created by pcurr on 25/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p1_Read_50Numbers_Count {

   public static void main(String[] args) throws IOException{

       int total = 0;

       try{
           FileReader fr = new FileReader("NewFifty.txt");
           BufferedReader br = new BufferedReader(fr);

           String c = br.readLine();

           while (c != null){
               total += Integer.parseInt(c);
               c = br.readLine();
           }//while

           br.close();
           fr.close();

           System.out.println("Total: " + total);

       } catch (IOException e){
           System.out.println(e);
       }

   }//main
}//class
