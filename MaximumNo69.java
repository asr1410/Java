public class MaximumNo69 {
    public static int maximum69Number(int num) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        temp = num;
        int[] arr = new int[count];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }
        temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                arr[i] = 9;
                break;
            }
        }
        for (int i : arr) {
            temp = (temp * 10) + i;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(9996));
    }
}
