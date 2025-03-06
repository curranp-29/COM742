package Practicals;

import java.util.Arrays;
import java.util.Random;

public class Q6_Bubble_Selection_Insertion {

    public static void main(String[] args) {

        //initialise
        Random random = new Random();
        int [] arrayRandom = new int[100];
        int [] arrayRandom2 = new int[100];
        int [] arrayRandom3 = new int[100];

        //populate arrayRandom
        for(int i = 0; i < arrayRandom.length; i++){
            arrayRandom[i] = random.nextInt(100)+1;
        }//for

        //populate arrayRandom2
        for(int i = 0; i < arrayRandom2.length; i++){
            arrayRandom2[i] = random.nextInt(100)+1;
        }//for

        //populate arrayRandom3
        for(int i = 0; i < arrayRandom3.length; i++){
            arrayRandom3[i] = random.nextInt(100)+1;
        }//for


        //used to get the current time in MS
        long bubbleTime = System.nanoTime();
        //bubble sort
        bubbleSortOptimised(arrayRandom);
        System.out.println(Arrays.toString(arrayRandom));
        long bubbleTimeEnd = System.nanoTime();
        long bubbleTotal = bubbleTimeEnd - bubbleTime;
        System.out.println(bubbleTotal);

        //selection sort
        long selectionTime = System.nanoTime();
        selectionSort(arrayRandom2);
        System.out.println(Arrays.toString(arrayRandom2));
        long selectionTimeEnd = System.nanoTime();
        long selectionTotal = selectionTimeEnd - selectionTime;
        System.out.println(selectionTotal);

        //insertion
        long insertionTime = System.nanoTime();
        insertionSort(arrayRandom3);
        System.out.println(Arrays.toString(arrayRandom3));
        long insertionTimeEnd = System.nanoTime();
        long insertionTotal = insertionTimeEnd - insertionTime;
        System.out.println(insertionTotal);

    }//main

    public static void bubbleSortOptimised(int [] data) {
        int swapBS1 = 0, comparisonBS1 = 0;
        boolean swapped = true;

        for (int out = data.length - 1; out > 0; out--) {
            swapped = false;
            for (int in = 0; in < out; in++) {
                comparisonBS1++;
                if (data[in] > data[in + 1]) {
                    swapped = true;
                    int tmp = data[in];
                    data[in] = data[in + 1];
                    data[in + 1] = tmp;
                    swapBS1++;
                }//if
            }//for

//            for (int i = 0; i < data.length; i++) {
//                System.out.print(data[i] + " ");
//            }//for
//            System.out.println();

            if (swapped == false) {
                out = 0;
            }
        }
        System.out.println("Swaps: " + swapBS1);
        System.out.println("Comparisons: " + comparisonBS1);
    }

    public static void selectionSort(int data[]) {
        int in, out, min;
        int comparisonSS = 0, swapSS = 0;
        for (out=0; out < data.length-1; out++) {
            min = out;
            for (in = out+1; in < data.length; in++) {
                comparisonSS++;
                if (data[in] < data[min]) {
                    min = in;
                    swapSS++;          // new minimum
                }
            }
            int tmp = data[out];     // swap items
            data[out] = data[min];   //
            data[min] = tmp;       //
        }
        System.out.println("swapsSS=" + swapSS);
        System.out.println("ComparisonsSS= " + comparisonSS);
    }


    public static void insertionSort( int data[] ) {
        int in, out, temp;
        int copies = 0, swapIS = 0;
        for (out=1; out < data.length; out++) {
            temp = data[out];
            copies++;
            for (in=out; in > 0 && data[in-1] >= temp; in--) {
                data[in] = data[in-1];
                swapIS++;
            }
            data[in] = temp;
        }
        System.out.println("swapsIS=" + swapIS);
        System.out.println("CopiesIS= " + copies);
    }

}//class
