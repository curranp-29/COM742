package week3A_SortingAlgorithms.Practicals;

import java.util.Arrays;
import java.util.Random;

public class Q8_MergeSort {

    public static void main(String[] args) {

        Random random = new Random();
        int [] arrayRandom4 = new int[10000];

        //populate arrayRandom
        for(int i = 0; i < arrayRandom4.length; i++){
            arrayRandom4[i] = random.nextInt(10000)+1;
        }//for

        //Quadratic Time Complexity/ Bubble Sort, Selection Sort, Insertion Sort

        long SortTime = System.nanoTime();
        Arrays.sort(arrayRandom4);
        long SortTimeEnd = System.nanoTime();
        long SortTotal = SortTimeEnd - SortTime;
        System.out.println(SortTotal);


        //Log-Linear Time Complexity/ Merge Sort+
        //used to get the current time in NS
        long mergeSortTime = System.nanoTime();
        mergeSort(arrayRandom4, 0, arrayRandom4.length - 1);
        long mergeSortTimeEnd = System.nanoTime();
        long mergeSortTotal = mergeSortTimeEnd - mergeSortTime;
        System.out.println(mergeSortTotal);

    }//main

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort both halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];

        for (int i = 0; i < n2; i++)
            rightArr[i] = arr[mid + 1 + i];

        // Merge the temporary arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr (if any)
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr (if any)
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }


}//class
