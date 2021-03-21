import java.util.Scanner;

/**
 * MiddleCharacter
 */
public class MiddleCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        char ch[] = str.toLowerCase().toCharArray();
        int c = 0;
        String sp = "";
        if (str.length() < 3) {
            System.out.println("the string should not have " + str + " is too short");
        } else {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    c++;
                } else {
                    sp += ch[i];
                }
            }
            if (ch.length != c) {
                System.out.println("This string should not have");
                System.out.println(sp);
            } else if (ch.length == c) {
                System.out.println("middle characters:");
                if (ch.length % 2 == 0) {
                    String out = " " + ch[(ch.length / 2) - 1] + ch[(ch.length / 2)];
                    System.out.println(out);
                } else {
                    String out = "" + ch[ch.length / 2];
                    System.out.println(out);
                }
            }
        }
        sc.close();
    }
}