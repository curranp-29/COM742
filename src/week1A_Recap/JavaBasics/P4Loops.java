package week1A_Recap.JavaBasics;

public class P4Loops {

    public static void main(String[] args) {

        int number = 1;

        while (number <= 10){
            System.out.println("Number " + number);
            number++;
        }//while
        System.out.println();

        for (int x = 0; x <= 10; x++){
            System.out.println("Number " + x);
        }//for
        System.out.println();

        String [] fruits = {"Apple", "Banana", "Orange", "Grapes"};
        for (String fruit : fruits){
            System.out.println(fruit);
        }//for each

    }//main
}//class
