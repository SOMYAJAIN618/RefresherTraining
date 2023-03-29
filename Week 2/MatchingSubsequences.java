public class MatchingSubsequences {

    public static void main(String[] args) {

        String str = "abcabc";
        String subsequence = "abc";

        int count = countMatchingSubsequences(str, subsequence);

        System.out.println("Number of matching subsequences are " + count);
    }

    public static int countMatchingSubsequences(String str, String subsequence) {
        int count = 0;

        // Starting position of matching subsequence in str
        int startIndex = 0;

        // Iterate over the entire string
        while (startIndex <= str.length() - subsequence.length()) {

            // Find the index of the next occurrence of the subsequence in str
            int index = str.indexOf(subsequence, startIndex);

            if (index != -1) {
                // If subsequence is found, increment count and move start index to the next character
                count++;
                startIndex = index + 1;
            } else {
                // If subsequence is not found, exit the loop
                break;
            }
        }

        return count;
    }
}
