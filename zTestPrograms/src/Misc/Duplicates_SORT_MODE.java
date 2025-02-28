package Misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Duplicates_SORT_MODE {

    public static void main(String[] args) {

        // Example array and list
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6};
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 2, 9, 1, 5, 6);

        // Find duplicates in array
        System.out.println("Duplicates in array: " + findDuplicates(array));

        // Sort list
        System.out.println("Original list: " + list);
        bubbleSort(list);
//        sortList(list);
        System.out.println("Sorted list: " + list);

        // Find mode in array
        System.out.println("Mode in array: " + findMode(array));
    }//main

    // Method to find duplicates in an array
    public static HashSet<Integer> findDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int value : array) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }

        return duplicates;
    }//findDuplicates

    // Method to sort a list
    public static void sortList(List<Integer> list) {
        Collections.sort(list);
    }//sortList


    // Method to sort a list using Bubble Sort
    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap list[j] and list[j + 1]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }//if
            }//for
        }//for
    }//bubbleSort


    // Method to find the mode in an array
    public static int findMode(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int value : array) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        // Find the element with the highest frequency
        int mode = array[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }//findMode

}//class
