import java.util.Scanner;

// Mindtree
// 1 2 3 4 5 6 7 8 
// 0 2 0 4 0 6 0 8 
// 2 4 6 8 0 0 0 0 
// 0 4 0 8 0 0 0 0 
// 4 0 8 0 0 0 0 0
// 4 8 0 0 0 0 0 0
// 0 8 0 0 0 0 0 0
// 8 0 0 0 0 0 0 0 
public class Mindtree {
    static int largestNoOfArray(int num) {
        int arr[] = new int[num];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }
        while (arr[1] != 0) {
            for (int i = 0; i < length; i = i + 2) {
                arr[i] = 0;
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
            length = length / 2;
            for (int i = 0; i < length; i++) {
                int j = (2 * i) + 1;
                arr[i] = arr[j];
                arr[j] = 0;
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
        return arr[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.print("enter the value : ");
        input = sc.nextInt();
        System.out.println(largestNoOfArray(input));
        sc.close();

    }
}