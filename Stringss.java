import java.util.Scanner;

/**
 * Stringss
 */
public class Stringss {

    public static void main(String[] args) {
        // String name = new String("Harry");
        String name = "harry";
        System.out.println(name);
        int a = 5;
        float b = 5.6f;
        System.out.printf("the value of a is %d and the value of b is %.2f\n", a, b);
        System.out.format("the value of a is %d and the value of b is %.2f\n", a, b);
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        st = sc.nextLine();
        System.out.println(st);
        sc.close();
    }
}