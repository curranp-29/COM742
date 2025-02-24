package week2A_DataStructures;

//FIRST IN LAST OUT EXAMPLE FILO

import java.util.LinkedList;

public class StackList {

    public static void main(String[] args) {

        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(6);
        stack.push(789);
        stack.push(0);
        stack.push(5);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);


    }//main

    public LinkedList<Integer> push(LinkedList<Integer> x, int value){
        x.add(0,value);
        return x;
    }//push

    public LinkedList<Integer> pop(LinkedList<Integer> x, int value){
        x.remove(0);
        return x;
    }//pop

}//class
