public class SubarraywithSum {
    public static int subArrayCount(int arr[], int sum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            int tempCount = 0;
            for (int j = i; j < arr.length; j++) {
                tempSum += arr[j];
                tempCount++;
                if (tempSum >= sum) {
                    if (i == 0) {
                        count = tempCount;
                    } else if (tempCount < count) {
                        count = tempCount;
                    }
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int sum = 40;
        System.out.println(subArrayCount(arr, sum));
    }
}
