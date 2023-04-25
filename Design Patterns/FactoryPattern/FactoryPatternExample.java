package FactoryPattern;

// Define an interface for creating objects
interface AnimalFactory {
    public Animal createAnimal();
}

class CatFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Cat();
    }
}

class DogFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Dog();
    }
}

abstract class Animal {
    public abstract void makeSound();
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}


public class FactoryPatternExample {
    public static void main(String[] args) {
        // Create a cat factory
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeSound();

        // Create a dog factory
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeSound();
    }
}
