package TemplateImplementation;
abstract class Recipe {
    public void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public abstract void addIngredients();

    public abstract void cook();

    public void serve() {
        System.out.println("Serving...");
    }
}

class PizzaRecipe extends Recipe {
    @Override
    public void addIngredients() {
        System.out.println("Adding pizza ingredients...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pizza...");
    }
}

class SpaghettiRecipe extends Recipe {
    @Override
    public void addIngredients() {
        System.out.println("Adding spaghetti ingredients...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking spaghetti...");
    }
}

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Recipe pizzaRecipe = new PizzaRecipe();
        Recipe spaghettiRecipe = new SpaghettiRecipe();

        System.out.println("Making pizza...");
        pizzaRecipe.prepareRecipe();

        System.out.println("\nMaking spaghetti...");
        spaghettiRecipe.prepareRecipe();
    }
}
