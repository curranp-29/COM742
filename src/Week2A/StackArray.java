package Week2A;

import java.util.Arrays;
import java.util.Stack;

public class StackArray {

    public static void main(String[] args) {

        StackArray stack = new StackArray(10);
        System.out.println(stack);

        stack.push(6);
        stack.push(789);
        stack.push(1);
        stack.push(5);
        stack.push(0);
        System.out.println(stack);

        stack.pop();
        stack.pop();
        System.out.println(stack);

    }//main


    private int[] stack;
    private int top;

    public StackArray(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow!");
        } else {
            top++;
            stack[top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
            return -1;
        } else {
//            int value = stack[top];
//            stack[top] = 0;
//            top--;
//            return value;
        }//FIL0

        int value = stack[0];
        for(int i = 0; i < stack.length - 1; i++){
            stack[i] = stack[i + 1];
        }//for
        top--;
        //FIFO
        return value;

    }

    @Override
    public String toString() {
     return "Stack: " + Arrays.toString(stack);
    }//toString
}
