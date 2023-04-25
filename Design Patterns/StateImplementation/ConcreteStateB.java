package StateImplementation;

public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling state B.");
        context.setState(new ConcreteStateA());
    }
}
