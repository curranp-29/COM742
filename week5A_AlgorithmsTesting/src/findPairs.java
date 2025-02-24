import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class findPairs {
    public static void main(String[] args){

        int[] array = {1,2,3,4,4,5,6,7,7,8,9};

        findPairs(array);

    }//main

    public static void findPairs(int[] arr) {
        List<Integer> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    pairs.add(arr[i]);
                }//if
            }//for
        }//for
        System.out.println(pairs);
    }//findPairs


    public static void findMode(int[] array){
        HashSet<Integer> pairs = new HashSet<>();
        int mode = 0;
        int maxCount = 0;

        for(int i = 0; i < array.length; i++){
            int count = 0;
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]) {
                count++;
                pairs.add(array[i]);
                }//if
                if (count > maxCount){
                    maxCount = count;
                    mode = array[i];
                }
            }
            System.out.println("First mode: " + mode);
        }
    }

}//class
