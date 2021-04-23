public class MaxDepthOfString {
    public static int maxDepth1(String s) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                temp++;
            } else if (s.charAt(i) == ')') {
                temp--;
            }
            if (temp > count) {
                count = temp;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth1(s));
    }
}
