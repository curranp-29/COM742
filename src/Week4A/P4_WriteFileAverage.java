package Week4A;
import java.io.*;
import java.util.Random;

public class P4_WriteFileAverage {

    public static void main(String[] args) {

//        int fileSize = 1000;
//        writeToFile("Comparing.txt", fileSize);

        System.out.println(whileAverage("Comparing.txt"));
        System.out.println(forAverage("Comparing.txt", 1000));



    }//main

    public static int whileAverage(String filename){
        int total = 0, count = 0;

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String c1 = br.readLine();
            while (c1 != null) {

                int num = Integer.parseInt(c1);
                total += num;
                c1 = br.readLine();
                count++;
            }
            br.close();
            fr.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        int average = total / count;

        return average;
    }//while

    public static int forAverage(String filename, int size){
        int total = 0;

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            for(int i = 0; i < size; i++){
                String c1 = br.readLine();
                int num = Integer.parseInt(c1);
                total = total + num;
            }
            br.close();
            fr.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        int average = total / size;
        return average;
    }//for

    public static void writeToFile(String fileName, int size) {

        Random rand = new Random();

        try{
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            for (int i=0; i<size; i++) {
                pw.println(rand.nextInt(size * 10) + 1);
            }
            pw.close();
            bw.close();
            fw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
