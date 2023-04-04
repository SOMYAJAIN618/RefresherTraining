
import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("a", 2);
        unsortedMap.put("b", 3);
        unsortedMap.put("c", 1);
        unsortedMap.put("d", 4);

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

        System.out.println(sortedMap);
    }
}
