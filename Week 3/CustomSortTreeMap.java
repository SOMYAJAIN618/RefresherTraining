
import java.util.Comparator;
import java.util.TreeMap;

public class CustomSortTreeMap {
    public static void main(String[] args) {
        //sorting based on length of the string
        TreeMap<String, Integer> treeMap = new TreeMap<>(new KeyLengthComparator());

        treeMap.put("abc", 1);
        treeMap.put("abcd", 2);
        treeMap.put("xyz", 3);
        treeMap.put("opqr", 4);

        System.out.println("TreeMap:");
        for (String key : treeMap.keySet()) {
            System.out.println(key + " : " + treeMap.get(key));
        }
    }
    private static class KeyLengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            if (s1.length() < s2.length()) {
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            } else {
                return s1.compareTo(s2);
            }
        }
    }
}