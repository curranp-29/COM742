package Week2A;

import java.util.Arrays;
import java.util.LinkedList;

public class Q1b {

    public static void main(String[] args) {

        int numArray[] = new int[9];

        for(int i = 0; i <= 3; i++){
            numArray[i+1] = 3*(i+1);
        }//for

        for(int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + " ");
        }//for
        System.out.println();


        //LinkedList
        LinkedList<Number> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);
        System.out.println(numbers);

    }//main
}//class
