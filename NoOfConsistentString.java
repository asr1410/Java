import java.util.HashSet;
import java.util.Set;

public class NoOfConsistentString {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistent = 0;
        Set<Character> alphabetLetter = new HashSet<>();
        for (char word : allowed.toCharArray()) {
            alphabetLetter.add(word);
        }
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!alphabetLetter.contains(word.charAt(i))) {
                    break;
                }
                if (i == word.length() - 1) {
                    consistent++;
                }
            }
        }
        return consistent;
    }

    public static void main(String[] args) {

    }
}