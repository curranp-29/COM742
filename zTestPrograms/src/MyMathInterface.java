public interface MyMathInterface {

    static void squared(int x){
        System.out.println("Interface: " + x * x);
    }//squared

    static int cubed (int x){
        System.out.println("Interface" + x * x * x);
        return x * x;
    }//cubed

}//interface
