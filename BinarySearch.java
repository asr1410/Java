import java.util.Scanner;

public class BinarySearch {
    public static boolean binarySearch(int arr[], int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == num || arr[left] == num || arr[right] == num) {
                return true;
            } else if (arr[mid] > num) {
                right = mid + 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (binarySearch(arr, n)) {
            System.out.println("element is present");
        } else {
            {
                System.out.println("element is not present");
            }
        }
    }
}
