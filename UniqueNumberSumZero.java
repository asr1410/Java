public class UniqueNumberSumZero {
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 - n + 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        for (int ele : sumZero(5)) {
            System.out.println(ele);
        }
    }
}
