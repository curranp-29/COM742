public interface MyMathInterface {

    public default void squared(int x){
        System.out.println("Interface: " + x * x);
    }//squared

    public default int cubed (int x){
        System.out.println("Interface" + x * x * x);
        return x * x;
    }//cubed

}//interface