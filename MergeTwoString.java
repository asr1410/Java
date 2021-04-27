public class MergeTwoString {
    public static String mergeAlternately(String word1, String word2) {
        char[] c = new char[word1.length() + word2.length()];
        int j = 0;
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            int count = 0;
            if (j < word1.length()) {
                c[i] = word1.charAt(j);
                j++;
                count++;
            }
            if (k < word2.length()) {
                if (count == 1) {
                    i++;
                    c[i] = word2.charAt(k);
                    k++;
                } else {
                    c[i] = word2.charAt(k);
                    k++;
                }
            }
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        String a = "ab";
        String b = "pqrs";
        System.out.println(mergeAlternately(a, b));
    }
}
