package week3A_SortingAlgorithms.Practicals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q1_BubbleSort {

    public static void main(String[] args) {

        //initialise array
        int [] array = new int []{2,5,9,3,13,1,16,7,8,15,4,6};

        //call method
        bubbleSort(array);

        //readFile


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
}//class


