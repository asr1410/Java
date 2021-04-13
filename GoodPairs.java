import java.util.Scanner;

public class GoodPairs {
    public static int goodpairs(int[] arr) {
        int goodPair = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    goodPair++;
                }
            }
        }
        return goodPair;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        goodpairs(arr);
        sc.close();
    }
}
