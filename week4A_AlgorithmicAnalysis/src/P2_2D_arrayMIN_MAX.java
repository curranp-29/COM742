import java.util.Arrays;
import java.util.Random;

public class P2_2D_arrayMIN_MAX {

    public static void main(String[] args) {

        int [][] numArray = generateRandom(10);
        System.out.println(Arrays.deepToString(numArray));
        long CurrentTime = System.nanoTime();
        System.out.println("Min: " + findMin(numArray) + ", " + "Max: " + findMax(numArray));
        long CurrentTimeEnd = System.nanoTime();
        long Totaltime = CurrentTimeEnd - CurrentTime;
        System.out.println("Total time: " + Totaltime);

    }//main


    public static int [][] generateRandom(int size){
        Random rand = new Random();
        int [][] num = new int[size][size];
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[0].length; j++)
            num[i][j] = rand.nextInt(size)+ 1;
        }//for
        return num;
    }//generateRandom



    public static int findMin(int [][]num){
        int min = num[0][0];

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[0].length; j++){
                if(num[i][i] < min){
                    min = num[i][i];
                }//if
            }//for
        }//for
        return min;
    }//findMin


    public static int findMax(int [][]num){
        int max = num[0][0];

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[0].length; j++){
                if(num[i][i] > max){
                    max = num[i][i];
                }//if
            }//for
        }//for
        return max;
    }//findMin

}//class
