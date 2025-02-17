package Week4A;
import java.util.Arrays;
import java.util.Random;

public class P1_ArrayRandom {

    public static void main(String[] args) {

        int [] numArray = generateRandom(100);
        System.out.println(Arrays.toString(numArray));


        //THIS IS THE COMPLEXITY N UNSORTED ARRAY FIND MIN, FIND MAX
        long CurrentTime = System.nanoTime();
        System.out.println("Min: " + findMin(numArray) + ", " + "Max: " + findMax(numArray));
        long CurrentTimeEnd = System.nanoTime();
        long Totaltime = CurrentTimeEnd - CurrentTime;
        System.out.println("Total time: " + Totaltime);


        //THIS IS THE COMPLEXITY N LOG N SORTED ARRAY FIND MIN, FIND MAX
        CurrentTime = System.nanoTime();
        System.out.println("MinSort: " + findMinSort(numArray) + ", " + "MaxSort: " + findMaxSort(numArray));
        CurrentTimeEnd = System.nanoTime();
        Totaltime = CurrentTimeEnd - CurrentTime;
        System.out.println("Total time: " + Totaltime);


        System.out.println("Unsorted Array Duplicates: " + checkDuplicatesUnsorted(numArray));
        System.out.println("Sorted Array Duplicates: " + checkDuplicatesSorted(numArray));


        int range = findMax(numArray) - findMin(numArray);
        System.out.println("Range: " + range);

    }//main



    public static int [] generateRandom(int size){
        Random rand = new Random();
        int [] num = new int[size];
        for(int i = 0; i < num.length; i++){
            num[i] = rand.nextInt(size)+ 1;
        }//for
        return num;
    }//generateRandom


    //COMPLEXITY IS N
    public static int findMin(int [] num){
        int min = num[0];

        for(int i = 0; i < num.length; i++){
            if(num[i] < min){
                min = num[i];
            }//if
        }//for
        return min;
    }//findMin

    //COMPLEXITY IS N
    public static int findMax(int [] num){
        int max = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }//if
        }//for
        return max;
    }//findMin


    //SORT TAKES LONGER EVEN THOUGH ITS MOST EFFICIENT SORT N LOG N
    public static int findMinSort(int [] num){
        Arrays.sort(num);
        return num[0];
    }//findMin


    //SORT TAKES LONGER EVEN THOUGH ITS MOST EFFICIENT SORT N LOG N
    public static int findMaxSort(int [] num){
        Arrays.sort(num);
        return num.length - 1;
    }//findMin


    public static int checkDuplicatesSorted(int [] numArray){
        int duplicates = 0;
        Arrays.sort(numArray);
        //DUPLICATES DO NESTED FOR LOOP DUPLICATE
        for(int i = 0; i < numArray.length - 1; i++){
            if(numArray[i] == numArray[i+1]){
                duplicates++;
            }//if
        }//for
        return duplicates;
    }//checkDuplicatesSorted


    public static int checkDuplicatesUnsorted(int[] numArray){
        int duplicates = 0;
        boolean[] visited = new boolean[numArray.length];

        for(int i = 0; i < numArray.length - 1; i++){
            if(visited[i]) continue;

            int count = 1;
            for(int j = i+1; j < numArray.length - 1; j++){
                if(numArray[i] == numArray[j]){
                    count++;
                    visited[j] = true;
                }//if
            }//for
            if(count > 1){
                duplicates+= (count - 1);
            }
        }//for
        return duplicates;
    }

}

