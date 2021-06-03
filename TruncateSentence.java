public class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        StringBuilder sc = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                k--;
                if (k == 0) {
                    break;
                }
            }
            sc.append(s.charAt(i));
        }
        return sc.toString();
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }
}
