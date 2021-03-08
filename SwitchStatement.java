import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        char method;
        double a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.print("enter the operator :- ");
        method = sc.next().charAt(0);

        switch (method) {
        case '+':
            System.out.println(a + " " + method + " " + b + " = " + (a + b));
            break;
        case '-':
            System.out.println(a + " " + method + " " + b + " = " + (a - b));
            break;
        case '*':
            System.out.println(a + " " + method + " " + b + " = " + (a * b));
            break;
        case '%':
            System.out.println(a + " " + method + " " + b + " = " + (a % b));
            break;
        case '/':
            System.out.println(a + " " + method + " " + b + " = " + (a / b));
            break;
        default:
            System.out.println("The operator is invalid");
            break;
        }
        sc.close();
    }
}
