import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] arr = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                "--.." };
        Set<String> s = new HashSet<>();
        for (String string : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : string.toCharArray()) {
                sb.append(arr[c - 'a']);
            }
            s.add(sb.toString());
        }
        return s.size();
    }

    public static void main(String[] args) {
        String s[] = { "gin", "zen", "gig", "msg" };
        System.out.println(uniqueMorseRepresentations(s));
    }
}
