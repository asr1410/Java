import java.util.*;

public class SentenceIsPanagram {
    public static boolean checkIfPangram1(String sentence) {
        int seen = 0;
        for (char c : sentence.toCharArray()) {
            int ci = c - 'a';
            seen = seen | (1 << ci);
        }
        return seen == ((1 << 26) - 1);
    }

    public static boolean checkIfPangram2(String sentence) {
        String[] alp = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z" };
        ArrayList<String> al = new ArrayList<>(Arrays.asList(alp));
        for (String ch : al) {
            if (sentence.indexOf(ch) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram1("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram2("thequickbrownfoxjumpsoverthelazydog"));
    }
}
