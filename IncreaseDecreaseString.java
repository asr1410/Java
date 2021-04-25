/**
 * IncreaseDecreaseString
 */
public class IncreaseDecreaseString {
    public static String sortString(String s) {
        int length = s.length();
        int[] frequency = new int[26];
        for (char i : s.toCharArray()) {
            frequency[i - 'a']++;
        }
        int count = 0;
        StringBuilder sb = new StringBuilder(s.length());
        while (count < length) {
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > 0) {
                    sb.append((char) (i + 'a'));
                    frequency[i]--;
                    count++;
                }
            }
            for (int j = 25; j >= 0; j--) {
                if (frequency[j] > 0) {
                    sb.append((char) (j + 'a'));
                    frequency[j]--;
                    count++;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        System.out.println(sortString(s));
    }
}