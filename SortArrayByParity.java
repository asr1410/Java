public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int a[] = new int[A.length];
        int k = 0;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (A[i] % 2 == 0) {
                a[j] = A[i];
                j++;
            } else {
                a[a.length - k - 1] = A[i];
                k++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        for (int i : sortArrayByParity(arr)) {
            System.out.println(i);
        }
    }
}
