
/**
 * Fibonacci
 */
public class Fibonacci {
    static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int term = 5;
        System.out.println(fib(term));

    }
}