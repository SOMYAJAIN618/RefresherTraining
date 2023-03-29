
import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public final class ImmutableClass {
    private final int data;
    private final List<String> list;

    public ImmutableClass(int data, List<String> list) {
        this.data = data;
        // create a new list to avoid mutability
        this.list = Collections.unmodifiableList(new ArrayList<>(list));
    }

    public int getData() {
        return data;
    }

    public List<String> getList() {
        return list;
    }
}