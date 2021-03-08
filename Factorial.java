import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial --> ");
        num = sc.nextInt();
        for (int i = 2; i < num + 1; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
        sc.close();
    }
}
