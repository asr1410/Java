/**
 * Rough
 */
public class Rough {
    public int binarySearch(int arr[], int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x = 5;
        Rough s = new Rough();
        if (s.binarySearch(arr, x) == -1) {
            System.out.println("element is not present");
        } else {
            System.out.println("element is present at index " + s.binarySearch(arr, x));
        }
    }
}