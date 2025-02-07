package Week1A.JavaBasics;

/****
 ***** Created by pcurr on 04/11/2024
 ***** UPDATE PROGRAM DESCRIPTION
 *****/
public class Algorithm {

    public static void main(String[] args) {

        int sum = sumRange(1,10);
        System.out.println("Answer is " + sum);
    }//main

    //method function
    public static int sumRange(int s, int e){
        int n = e - s + 1;
        int sum = (n * (s + e) / 2);
        return sum;
    }//sumRange

}//class
