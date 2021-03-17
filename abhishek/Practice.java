package abhishek;

import java.lang.Math;

class Calculator {
    public void calculate1(int a, int b) {
        System.out.println("Your result is " + (a + b));
    }
}

class ScientificCalculator extends Calculator {
    public void calculate2(int a, int b) {
        System.out.println("Your result is " + Math.sin(a + b));
    }
}

class HybridCalculator extends ScientificCalculator {
    public void calculate3(int a, int b) {
        System.out.println("Your result is " + (a + b));
        System.out.println("Your result is " + Math.sin(a + b));
    }
}

public class Practice {
    public static void main(String[] args) {
        HybridCalculator c = new HybridCalculator();
        c.calculate1(50, 40);
        c.calculate2(50, 40);
        c.calculate3(50, 40);
    }
}
