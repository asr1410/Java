public class TwoCharStringSame {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : word1)
            sb1.append(s);
        for (String s : word2)
            sb2.append(s);
        // System.out.println(sb1.toString());
        // System.out.println(sb2.toString());
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String[] s2 = { "abcddefg" };
        String[] s1 = { "abc", "d", "defg" };
        System.out.println(arrayStringsAreEqual(s1, s2));
    }
}
