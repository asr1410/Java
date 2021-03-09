/**
 * Varargs
 */
public class Varargs {
    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }
    static int sum(int... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("welcome to varargs tutorial");
        System.out.println("the sum is " + sum(5, 5));
        System.out.println("the sum is " + sum(5, 5, 5));
        System.out.println("the sum is " + sum(5, 5, 5, 5));
        System.out.println("the sum is " + sum(5, 5, 5, 5, 5));
    }
}