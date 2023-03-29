
class Palindrome {
    static boolean isPalindrome(String str)
    {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str = "abcDdcba";
        str = str.toLowerCase();

        if (isPalindrome(str))
            System.out.print("The string is a palindrome.");
        else
            System.out.print("The string is not a palindrome");
    }
}

