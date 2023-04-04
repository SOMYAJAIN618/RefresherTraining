
import java.util.Arrays;
import java.util.HashSet;

public class LongestWordInDictionary {

    public static String longestWord(String[] words) {
        HashSet<String> wordSet = new HashSet<String>(Arrays.asList(words));
        Arrays.sort(words, (a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length()); //sorting in decreasing order based on length 

        for (String word : words) {
            boolean isValid = true;
            for (int i = 1; i < word.length(); i++) {
                if (!wordSet.contains(word.substring(0, i))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                return word;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        String[] words = {"w", "wo", "wor", "worl", "world"};
        String longestWord = longestWord(words);
        System.out.println(longestWord);
    }
}
