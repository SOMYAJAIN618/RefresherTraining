
import java.util.Comparator;

public class MyClass implements Comparable<MyClass> {

    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // Implementing the Comparable interface method compareTo
    @Override
    public int compareTo(MyClass other) {
        return Integer.compare(this.value, other.value);
    }

    // Implementing the Comparator interface method compare
    public static Comparator<MyClass> comparator = new Comparator<MyClass>() {
        @Override
        public int compare(MyClass a, MyClass b) {
            return Integer.compare(a.getValue(), b.getValue());
        }
    };
}
