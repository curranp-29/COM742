public class FibonacciDynamicProgramming {

    public static void main(String[] args) {

        //Print 10th number in Fibonacci sequence
        System.out.println(fibonacci(10));

        }//main

    public static int fibonacci(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }//fibonacciDynamic

}//class
