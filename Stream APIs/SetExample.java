//Use of Collectors.toSet() and Collectors.toUnmodifiableSet()
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1};

        Set<Integer> set1 = Arrays.stream(numbers).collect(Collectors.toSet());
        System.out.println("Set1: " + set1);

        Set<Integer> set2 = Arrays.stream(numbers).collect(Collectors.toUnmodifiableSet());
        System.out.println("Set2: " + set2);

        try {
            set2.add(11);
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
