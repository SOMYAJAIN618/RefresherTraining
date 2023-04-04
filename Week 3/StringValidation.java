
import java.util.*;

public class StringValidation {
    public static void main(String[] args) {
        String input1 = "(){}[]";
        String input2 = "([)]";
        String input3 = "((()))";
        String input4 = "{()}";
        String input5 = "{(})";

        System.out.println(isValid(input1));
        System.out.println(isValid(input2));
        System.out.println(isValid(input3));
        System.out.println(isValid(input4));
        System.out.println(isValid(input5));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
