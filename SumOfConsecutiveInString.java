/**
 * Rough
 */
public class SumOfConsecutiveInString {
    public static int sumOfSingleDigit(String s) {
        int sum = 0;
        int prev;
        int mid;
        int next;
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                mid = a[i] - '0';
                next = a[i + 1] - '0';
                if (mid >= 0 && mid <= 9) {
                    if (next < 0 || next > 9) {
                        sum += mid;
                    }
                }
            } else if (i == a.length - 1) {
                prev = a[i - 1] - '0';
                mid = a[i] - '0';
                if (mid >= 0 && mid <= 9) {
                    if (prev < 0 || prev > 9) {
                        sum += mid;
                    }
                }
            } else {
                prev = a[i - 1] - '0';
                mid = a[i] - '0';
                next = a[i + 1] - '0';
                if (mid >= 0 && mid <= 9) {
                    if (prev < 0 || prev > 9) {
                        if (next < 0 || next > 9) {
                            sum += mid;
                        }
                    }
                }
            }
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "es3p5i22";
        System.out.println(sumOfSingleDigit(s));
    }
}