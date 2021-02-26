import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("take input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no 1");
        int a = sc.nextInt();
        System.out.println("enter no 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of these number is : " + sum);
        sc.close();
    }
}
