//Use of Collectors.toUnmodifiableList()
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableListExample {

    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("BB");
        letters.add("CCC");
        letters.add("DDDD");

        List<String> unmodifiableLetters = letters.stream().filter(name -> name.length() > 2).collect(Collectors.toUnmodifiableList());

        System.out.println("Original letters: " + letters);
        System.out.println("Unmodifiable letters: " + unmodifiableLetters);

        try {
            unmodifiableLetters.add("EEEEE");
            System.out.println("This should not be printed.");
        } catch (UnsupportedOperationException ex) {
            System.out.println("Caught an UnsupportedOperationException: " + ex.getMessage());
        }
    }
}
