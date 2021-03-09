import java.util.Scanner;

public class Arrayuses {
    public static void main(String[] args) {
        int[] marks = new int[5];
        System.out.println(marks.length);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
