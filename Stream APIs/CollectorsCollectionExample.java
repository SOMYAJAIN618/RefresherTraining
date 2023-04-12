
import java.util.ArrayList;
        import java.util.List;
        import java.util.TreeSet;
        import java.util.stream.Collectors;

public class CollectorsCollectionExample {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "cherry", "date", "strawberry");

        List<String> arrayList = fruits.stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println("ArrayList: " + arrayList);

        TreeSet<String> treeSet = fruits.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println("TreeSet: " + treeSet);
    }
}
