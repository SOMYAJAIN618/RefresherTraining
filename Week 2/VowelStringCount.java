class VowelStringCount {
    public static int vowelStrings(String[] words, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        else return false;
    }

    public static void main(String[] args) {
        String[] words = {"ami", "elboo", "p", "uganda"};
        int start = 0, end = words.length-1;

        System.out.println(vowelStrings(words, start, end));
    }
}
