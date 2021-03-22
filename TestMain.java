import java.util.Scanner;

/**
 * TestMain
 */
public class TestMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num = sc.nextByte();
        byte countPass = 0, countFail = 0;
        for (int i = 0; i < num; i++) {
            String arr = sc.next();
            if (arr.equalsIgnoreCase("pass")) {
                countPass++;
            } else if (arr.equalsIgnoreCase("fail")) {
                countFail++;
            } else {
                System.out.println("Invalid");
                System.exit(1);
            }
        }
        System.out.println("Pass count " + countPass);
        System.out.println("Fail count " + countFail);
        sc.close();
    }
}