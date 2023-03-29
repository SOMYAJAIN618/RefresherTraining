
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainMyClass {

    public static void main(String[] args) {

        // Creating some MyClass objects
        MyClass obj1 = new MyClass(3);
        MyClass obj2 = new MyClass(1);
        MyClass obj3 = new MyClass(2);

        // Comparing MyClass objects using compareTo
        System.out.println(obj1.compareTo(obj2)); // returns 1 (obj1 > obj2)
        System.out.println(obj2.compareTo(obj3)); // returns -1 (obj2 < obj3)
        System.out.println(obj1.compareTo(obj3)); // returns 1 (obj1 > obj3)

        // Sorting a list of MyClass objects using the comparator
        List<MyClass> list = Arrays.asList(obj1, obj2, obj3);
        Collections.sort(list, MyClass.comparator);
        System.out.println(list); 
    }
}
