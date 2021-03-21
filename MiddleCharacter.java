import java.util.Scanner;

/**
 * MiddleCharacter
 */
public class MiddleCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE STRING TO FIND MIDDLE ELEMENT --> ");
        String input = sc.next();
        char ch[] = input.toLowerCase().toCharArray();
        if (ch.length < 3) {
            System.out.println("STRING IS TOO SHORT TRY WITH A NEW STRING WITH SIZE GREATER THAN 2");
        } else {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                } else {
                    System.out.println("the string should only contain alphabets");
                    System.exit(1);
                }
            }
            if (ch.length % 2 == 0) {
                System.out.println(ch[(ch.length / 2) - 1] + "" + ch[(ch.length) / 2]);
            } else {
                System.out.println(ch[ch.length / 2]);
            }
        }
        sc.close();
    }
}