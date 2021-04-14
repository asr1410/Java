import java.util.Scanner;

public class AsciiCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a[] = s.toLowerCase().toCharArray();
        for (char c : a) {
            System.out.print(c);
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'a' && a[i] <= 'z') {

            } else {
                int temp = a[i];
                sum += temp;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
