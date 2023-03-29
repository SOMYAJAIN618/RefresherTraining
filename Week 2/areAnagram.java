

import java.util.Arrays;

class Anagram{
    static boolean areAnagram(char[] str1, char[] str2) {
        if (str1.length != str2.length)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < str1.length; i++)
            if (str1[i] != str2[i])
                return false;
        return true;
    }

    public static void main(String args[])
    {
        char str1[] = {'a', 'b', 'c', 'd'};
        char str2[] = {'d', 'c', 'a', 'b'};

        if (areAnagram(str1, str2))
            System.out.println("The two strings are anagram of each other.");
        else
            System.out.println("The two strings are not anagram of each other.");
    }
}


