package Week3A.SortingAlgorithms.Practicals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q4_ReadFiles_BubbleSort {

    public static void main(String[] args) {

        //initialise array
        int[] numbers = readNumbers("RandomNums.txt");
        //call method
        bubbleSort(numbers);

        //initialise array
        int[] numbers2 = readNumbers("SortedNums.txt");
        //call method
        bubbleSort(numbers2);

        //initialise array
        int[] numbers3 = readNumbers("UnsortedNums.txt");
        //call method
        bubbleSort(numbers3);

    }//main

    public static void bubbleSort(int [] data) {
        int swapBS = 0, comparisonBS = 0;

        for(int out = data.length - 1; out > 0; out--){
            for(int in = 0; in < out; in++){
                comparisonBS++;
                if(data[in] > data[in+1]){
                    int tmp = data[in];
                    data[in] = data[in + 1];
                    data[in+1] = tmp;
                    swapBS++;
                }//if
            }//for
        }//for

        System.out.println(Arrays.toString(data));
        System.out.println("Comparisons: " + comparisonBS);
        System.out.println("Swaps: " + swapBS);
    }//bubbleSort



    public static int[] readNumbers(String filename) {

        int[] array = new int[1];

        try {

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            Integer size = Integer.parseInt(c);
            array = new int[size];
            //System.out.println(array.length);

            for (int i=0; i< size; i++) {
                c = br.readLine();
                array[i] = Integer.parseInt(c);
                //System.out.println(array[i]);
            }
            br.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return array;
    }

}//class



