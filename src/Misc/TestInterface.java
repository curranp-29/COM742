package Misc;

import Misc.MyMathInterface;

public class TestInterface implements MyMathInterface {
    @Override
    public void squared(int x) {
        System.out.println("Interface: " + x * x);
    }

    @Override
    public int cubed(int x) {
        System.out.println("Override" + x * x * x);
        return x * x * x;
    }
}
