public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int count = 0;
        int right = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                right++;
                if (left == right) {
                    count++;
                }
            } else if (s.charAt(i) == 'L') {
                left++;
                if (left == right) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        BalancedStringSplit b = new BalancedStringSplit();
        System.out.println(b.balancedStringSplit("RLRRLLRLRL"));
    }
}
