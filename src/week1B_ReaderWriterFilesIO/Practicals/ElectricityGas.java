package week1B_ReaderWriterFilesIO.Practicals;

import java.io.*;
import java.text.DecimalFormat;

/****
 ***** Created by psd24cur on 31/01/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class ElectricityGas {
   public static void main(String[] args) throws IOException {

      DecimalFormat df = new DecimalFormat(".00");

      double[] gasTemp = new double[3];
      double[] eleTemp = new double[3];
      double[] totalTemp = new double[3];

      //for loop purposes
      int i = 0, j = 0;

      try{

         //Read Gas
         FileReader frGas = new FileReader("gas.txt");
         BufferedReader brGas = new BufferedReader(frGas);
         String gasVal = brGas.readLine();


         //LOOP read line and cast to double then assign array with this parsed value
         while (gasVal != null){
            double gasNum = Double.parseDouble(gasVal);
//            System.out.println(gasNum);
            gasTemp[i] = gasNum;
            i++;

            //reads next line
            gasVal = brGas.readLine();
         }//while

         //close readers
         brGas.close();
         frGas.close();


         //Read Electric
         FileReader frEle = new FileReader("electric.txt");
         BufferedReader brEle = new BufferedReader(frEle);
         String eleVal = brEle.readLine();


         //LOOP read line and cast to double then assign array with this parsed value
         while (eleVal != null){
            double eleNum = Double.parseDouble(eleVal);
//            System.out.println(eleNum);
            eleTemp[j] = eleNum;
            j++;
            //reads next line
            eleVal = brEle.readLine();
         }//while

         //close readers
         brEle.close();
         frEle.close();

         //print arrays
//         System.out.println(Arrays.toString(gasTemp));
//         System.out.println(Arrays.toString(eleTemp));


         for(int z = 0; z < totalTemp.length; z++){
            totalTemp[z] = gasTemp[z] + eleTemp[z];
         }//for


         //output after processing
         FileWriter fw = new FileWriter("total.txt");
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         for(int z = 0; z < totalTemp.length; z++){
            pw.println("Gas: £" + df.format(gasTemp[z]) + " Electric: £" + df.format(eleTemp[z]) + " Total: £" + df.format(totalTemp[z]));
         }

         pw.close();
         bw.close();
         fw.close();

      } catch (IOException e){
         System.out.println(e);
      }
   }
}
