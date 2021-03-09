public class Fibonacci {
    // RECURSIVE APPROACH

    // static int fib(int n) {
    // // Base Case
    // if (n <= 1)
    // return n;

    // // Recursive call
    // return fib(n - 1) + fib(n - 2);
    // }

    // public static void main(String[] args) {
    // int N = 10;
    // // Print the first N numbers
    // for (int i = 0; i < N; i++) {
    // System.out.print(fib(i) + " ");
    // }
    // }

    // ITERATIVE APPROACH
    static void Fibonacc(int N) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        // Iterate till counter is N
        while (counter < N) {
            // Print the number
            System.out.print(num1 + " ");
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    // Driver Code
    public static void main(String args[]) {
        // Given Number N
        int N = 10;
        // Function Call
        Fibonacc(N);
    }
}
