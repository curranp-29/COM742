import java.util.Arrays;

public class Assignment {

    public static void main(String[] args) {
        int[] best = new int[10];
        int[] worst = new int[10];
        int[] avg = new int[10];

        //best
        for(int i = 0; i < best.length; i++){
            best[i] = i+1;
        }

        //worst
        for(int i = best.length- 1; i > 0; i--){
            worst[i] = i;
        }

        //average
        for(int i = 0; i < best.length; i++){
            best[i] = i;
        }

        System.out.println(Arrays.toString(best));
        System.out.println();
        System.out.println(Arrays.toString(worst));
        System.out.println();
        System.out.println(Arrays.toString(avg));
    }

    public static int[] generateData(int dataSize){
        return null;
    }//generateData

}
