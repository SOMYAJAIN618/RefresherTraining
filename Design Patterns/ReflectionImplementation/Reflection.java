package ReflectionImplementation;

public class Reflection {
    private static final Reflection INSTANCE = new Reflection();

    private Reflection() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Cannot create multiple instances of a singleton");
        }
    }

    public static Reflection getInstance() {
        return INSTANCE;
    }
}
