
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainImmutableClass  {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        ImmutableClass immutable = new ImmutableClass(10, list);

        // prints 10
        System.out.println(immutable.getData());

        // prints [one, two, three]
        System.out.println(immutable.getList());

        // throws UnsupportedOperationException
        immutable.getList().add("four");
    }
}
