import java.util.Scanner;

/**
 * GrossNumber
 */
public class GrossNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int j = 0;
        for (int i = 1; i < 101; i++) {
            if ((i != 0) && (i % 2 == 0 || i % 3 == 0 || i % 5 == 0)) {
                arr[j] = i;
                j++;
            }
        }
        int input = sc.nextInt();
        if (input <= 0) {
            System.out.println("the number of integer " + input + " is invalid");
        } else if (input < 1 || input > 100) {
            System.out.println(input + " is not in range");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == input) {
                    System.out.println(1 + i);
                    System.exit(1);
                }
            }
            System.out.println(0);
        }
        sc.close();
    }
}