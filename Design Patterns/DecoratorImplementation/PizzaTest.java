package DecoratorImplementation;

// Test class
public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println("Base Pizza:");
        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getCost());

        Pizza cheesePizza = new Cheese(pizza);
        System.out.println("\nCheese Pizza:");
        System.out.println("Description: " + cheesePizza.getDescription());
        System.out.println("Cost: $" + cheesePizza.getCost());
    }
}
