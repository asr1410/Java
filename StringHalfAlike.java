public class StringHalfAlike {
    public static boolean halvesAreAlike(String s) {
        int count = 0;
        char[] c = s.toLowerCase().toCharArray();
        for (int i = 0; i < c.length / 2; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                count++;
            }
            if (c[c.length / 2 + i] == 'a' || c[c.length / 2 + i] == 'e' || c[c.length / 2 + i] == 'i'
                    || c[c.length / 2 + i] == 'o' || c[c.length / 2 + i] == 'u') {
                count--;
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("AbCdEfGh"));
    }
}
