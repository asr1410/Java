import java.util.Arrays;
import java.util.Scanner;

public class GoodPair {
    public static int pairs(int arr[]) {
        Arrays.sort(arr);
        int count = 0;
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == arr[i]) {
                count += j - i;
            } else {
                i = j;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pairs(arr));
        sc.close();
    }
}
