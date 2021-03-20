/**
 * TryAndCatch
 */
public class TryAndCatch {

    public static void main(String[] args) {
        int a = 100;
        int b = 00;
        // Using default method
        // int c = a / b;
        // System.out.println("the result is " + c);
        // using exception handling
        try {
            int c = a / b;
            System.out.println("the result is " + c);
        } catch (Exception e) {
            System.out.println("there is a error of " + e);
        }
    }
}