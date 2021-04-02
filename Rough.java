import java.util.Scanner;

/**
 * Rough
 */
public class Rough {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int countyes = 0;
        int countno = 0;
        for (int i = 0; i < num; i++) {
            String s = sc.next();
            if (s.equals("yes") || s.equals("YES") || s.equals("Yes")) {
                countyes++;
            } else if (s.equals("no") || s.equals("NO") || s.equals("No")) {
                countno++;
            }
        }
        System.out.println("Yes count " + countyes);
        System.out.println("No count " + countno);
        sc.close();
    }
}