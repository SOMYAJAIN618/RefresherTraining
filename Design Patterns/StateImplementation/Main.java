package StateImplementation;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.handleRequest(); // Output: Handling state A.
        context.handleRequest(); // Output: Handling state B.
        context.handleRequest(); // Output: Handling state A.
    }
}
