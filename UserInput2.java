import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        // boolean a = sc.hasNextInt();
        // System.out.println(a);
        String s = sc.nextLine();
        System.out.println(s);
        sc.close();
    }
}
