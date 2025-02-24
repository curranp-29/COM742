package week1B_ReaderWriterFilesIO.Practicals;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

/****
 ***** Created by psd24cur on 31/01/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/

public class P4StockReport {

   public static void main(String[] args) throws IOException {

      DecimalFormat df = new DecimalFormat(".00");
      Scanner scanner = new Scanner(System.in);

      String[] stock = new String[10];
      int[] quantity= new int[10];
      double[] price = new double[10];
      double[] value = new double[10];

      //for loop purposes
      int i = 0, j = 0, k = 0;

      System.out.print("Please provide stock file name: ");
      String stockfile = scanner.nextLine();

      System.out.print("Please provide quantity file name: ");
      String quantityfile = scanner.nextLine();

      System.out.print("Please provide price file name: ");
      String pricefile = scanner.nextLine();


      try{
         //Read Stock
         FileReader frStock = new FileReader(stockfile);
         BufferedReader brStock = new BufferedReader(frStock);
         String stockVal = brStock.readLine();

         //LOOP read line and cast to double then assign array with this parsed value
         while (stockVal != null){
//            System.out.println(gasNum);
            stock[i] = stockVal;
            i++;

            //reads next line
            stockVal = brStock.readLine();
         }//while

         //close readers
         brStock.close();
         frStock.close();


         //Read Quantity
         FileReader frQuantity = new FileReader(quantityfile);
         BufferedReader brQuantity = new BufferedReader(frQuantity);
         String quantityVal = brQuantity.readLine();


         //LOOP read line and cast to double then assign array with this parsed value
         while (quantityVal  != null){
            int quantNum = Integer.parseInt(quantityVal);
//            System.out.println(eleNum);
            quantity[j] = quantNum;
            j++;
            //reads next line
            quantityVal = brQuantity.readLine();
         }//while

         //close readers
         brQuantity.close();
         frQuantity.close();



         //Read Price
         FileReader frPrice = new FileReader(pricefile);
         BufferedReader brPrice = new BufferedReader(frPrice);
         String priceVal = brPrice.readLine();


         //LOOP read line and cast to double then assign array with this parsed value
         while (priceVal  != null){
            double priceNum = Double.parseDouble(priceVal);
//            System.out.println(eleNum);
            price[k] = priceNum;
            k++;
            //reads next line
            priceVal = brPrice.readLine();
         }//while

         //close readers
         brPrice.close();
         frPrice.close();



         //Populate Value Array
         for(int z = 0; z < value.length; z++){
            value[z] = quantity[z] * price[z];
         }//for


         //Output after processing
         FileWriter fw = new FileWriter("zStockValue.txt");
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         pw.println("Stock file: " + stockfile);
         pw.println("Quantity file: " + quantityfile);
         pw.println("Price file: " + pricefile);
         pw.println();

         pw.println("Stock\tQuantity\tPrice\tValue");
         for(int z = 0; z < value.length; z++){
            pw.println(stock[z] + "\t" + quantity[z] + "\t\t\t" + df.format(price[z]) + "\t£" + df.format(value[z]));
         }//for

         pw.close();
         bw.close();
         fw.close();


         //CATCH
      } catch (IOException e){
         System.out.println(e);
      }
   }
}
