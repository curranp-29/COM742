package Week2A_DataStructures;

public class Main {

    public static void main(String[] args) {
        StackArray stack = new StackArray(10);
        System.out.println(stack);

        stack.push(6);
        stack.push(789);
        stack.push(0);
        stack.push(5);

        System.out.println(stack);

        stack.pop();
        System.out.println();
    }//main
}//class
