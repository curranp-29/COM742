import java.io.*;
import java.text.DecimalFormat;

/****
 ***** Created by pcurr on 25/02/2025
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class p4_Stocks {
   public static void main(String[] args) throws IOException{

      DecimalFormat df = new DecimalFormat("00.00");

         try {
            FileReader fr = new FileReader("zStock.txt");
            BufferedReader br = new BufferedReader(fr);

            FileReader fr2 = new FileReader("zQuantity.txt");
            BufferedReader br2 = new BufferedReader(fr2);

            FileReader fr3 = new FileReader("zPrice.txt");
            BufferedReader br3 = new BufferedReader(fr3);

            FileWriter fw = new FileWriter("zStockValue.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("Stock\tQuantity\tPrice\tValue");


            String stock = br.readLine();

            while (stock != null) {

               //read other two files in while loop
               String quantity = br2.readLine();
               String price = br3.readLine();

               //cast to numeric values
               int qty = Integer.parseInt(quantity);
               double cost  = Double.parseDouble(price);

               //write output
               pw.println(stock + "\t" + quantity + "\t\t\t" + price + "\t" + df.format(qty * cost));

               //read line
               stock = br.readLine();
            }//while

            pw.close();
            bw.close();
            fw.close();

            br.close();
            fr.close();

            br2.close();
            fr2.close();

            br3.close();
            fr3.close();

         } catch (IOException e) {
            System.out.println(e);
         }//catch

      }//main
}//class
