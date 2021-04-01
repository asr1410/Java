import java.util.Scanner;

/**
 * Rough
 */
public class Rough {

    public static void main(String[] args) {
        int arr[][] = new int[4][7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int sum[] = new int[4];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < 7; j++) {
                sum[i] += arr[i][j];
            }
            System.out.println(sum[i]);
        }
        for (int i = 0; i < 7; i++) {
            float avg = 0;
            for (int j = 0; j < 4; j++) {
                avg += arr[j][i];
            }
            avg = avg / 4;
            System.out.printf("%.2f\n", avg);
        }
    }
}