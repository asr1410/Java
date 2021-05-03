public class RemoveOuterParanthesis {
    public static String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
        int count = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && count++ > 0) {
                s.append(c);
            }
            if (c == ')' && count-- > 1) {
                s.append(c);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }
}
