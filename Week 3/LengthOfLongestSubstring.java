
import java.util.*;

public class LengthOfLongestSubstring {
    public static int LongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charIndexMap.containsKey(c)) {
                j = Math.max(j, charIndexMap.get(c) + 1);
            }
            charIndexMap.put(c, i);
            maxLength = Math.max(maxLength, i - j + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println(LongestSubstring(s1));
        System.out.println(LongestSubstring(s2));
        System.out.println(LongestSubstring(s3));
    }
}
