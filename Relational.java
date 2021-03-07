import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        int age;
        System.out.print("enter the age :- ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        // logical AND an OR
        if (a && b || c) {
            System.out.println("Y");
        } else if (!c) {
            System.out.println("false");
        } else if (age > 56) {
            System.out.println("you are experinced");
        } else if (age > 46) {
            System.out.println("you are semi-experinced");
        } else if (age > 26) {
            System.out.println("you are an amateaur");
        } else {
            System.out.println("you cannot play the game");
        }
        sc.close();
    }
}
