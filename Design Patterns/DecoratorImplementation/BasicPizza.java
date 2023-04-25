package DecoratorImplementation;

// Concrete component
public class BasicPizza implements Pizza {
    public String getDescription() {
        return "Pizza";
    }

    public double getCost() {
        return 5.00;
    }
}
