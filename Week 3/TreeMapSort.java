
import java.util.*;

public class TreeMapSort {
    public static void main(String args[]) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(Collections.reverseOrder());

        treeMap.put(3, "Object Three");
        treeMap.put(1, "Object One");
        treeMap.put(2, "Object Two");
        treeMap.put(5, "Object Five");
        treeMap.put(4, "Object Four");

        for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }
    }
}
