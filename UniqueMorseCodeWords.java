import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] arr = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                "--.." };
        Set<String> set = new HashSet<>();
        for (String s : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch : s.toCharArray())
                sb.append(arr[ch - 'a']);
            set.add(sb.toString());
        }

        return set.size();

    }

    public static void main(String[] args) {
        String s[] = { "gin", "zen", "gig", "msg" };
        System.out.println(uniqueMorseRepresentations(s));
    }
}
