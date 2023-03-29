public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello, world!";

        System.out.println("Original string: " + str);

        // Reversing the string in place
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        String reversed = new String(chars);

        System.out.println("Reversed string: " + reversed);
    }
}
