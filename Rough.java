import java.util.Scanner;

/**
 * Rough
 */
public class Rough {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "aman";

        // METHOD 1 FOR STRING REVERSE
        // byte[] strAsByte = input.getBytes();
        // byte result[] = new byte[strAsByte.length];
        // for (int i = 0; i < result.length; i++) {
        // result[i] = strAsByte[result.length - i - 1];
        // }
        // String input1 = new String(result);
        // System.out.println(input1);
        // System.out.println(input);

        // METHOD 2 FOR STRING REVERSE
        // StringBuilder input1 = new StringBuilder();
        // input1.append(input);
        // input1.reverse();
        // System.out.println(input1);
        // System.out.println(input);

        // METHOD 3 FOR STRING REVERSE
        char[] try1 = input.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--) {
            System.out.printf("%c", try1[i]);
        }
        sc.close();
    }
}