package Week1B.Practicals;

import java.io.*;

/****
 ***** Created by psd24cur on 31/01/2025
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class P3PositiveNumbers {
    public static void main(String[] args) throws IOException {

        System.out.println("Total Count: " + countTotalPositiveValues("positivenumbers.txt"));

        int[] nums = {2,4,7,12,67,2};
        writeToFile(nums, "nums.txt");

    }//main

    public static int countTotalPositiveValues(String fname) throws IOException {

        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);
        String value = br.readLine();

        int total = 0;

        while (value != null){
            int num = Integer.parseInt(value);
            if(num > 0){
                total += num;
                value = br.readLine();
            }//if
            value = br.readLine();
        }
        br.close();
        fr.close();
        return total;
    }//method


    public static void writeToFile(int[] nums, String fname) throws IOException {
        try {

            FileWriter fw = new FileWriter(fname);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i =0; i<nums.length; i++){
                pw.println(nums[i]);
            }//for

            pw.close();bw.close();fw.close();
        }//end
        catch (IOException e) {
            System.out.println(e);
        }
    }

}//class