import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy Dog";

        if (isPangram(sentence)) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean isPangram(String sentence) {
        Set<Character> alphabet = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet.add(Character.toLowerCase(c));
            }
        }

        return alphabet.size() == 26;
    }
}