import java.util.*;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 5, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "Strawberry");

        // Collecting and then sum
        int sum = numbers.stream().collect(Collectors.collectingAndThen(Collectors.summingInt(Integer::intValue), i -> i));
        System.out.println("Sum of numbers: " + sum);

        // Joining strings
        String joinedWords = words.stream().collect(Collectors.joining(", "));
        System.out.println("Joined words: " + joinedWords);

        // Counting elements
        long count = words.stream().collect(Collectors.counting());
        System.out.println("Number of words: " + count);

        // Averaging integers
        double average = numbers.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Average of numbers: " + average);

        // Grouping by even or odd
        Map<Boolean, List<Integer>> groupedByEven = numbers.stream().collect(Collectors.groupingBy(i -> i % 2 == 0));
        System.out.println("Grouped by even or odd: " + groupedByEven);

        // Partitioning by even or odd
        Map<Boolean, List<Integer>> partitionedByEven = numbers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Partitioned by even or odd: " + partitionedByEven);

    }
}
