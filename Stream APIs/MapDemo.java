// Use of Collectors.toMap() and Collectors.toUnmodifiableMap()
import java.util.*;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", 30),
                new Person("Jane", 25),
                new Person("Mike", 35),
                new Person("Sara", 28)
        );

        //Map with name as key and age as value
        Map<String, Integer> nameAgeMap = persons.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println("Name-Age Map: " + nameAgeMap);

        //Unmodifiable Map with name as key and age as value
        Map<String, Integer> unmodifiableMap = persons.stream()
                .collect(Collectors.toUnmodifiableMap(Person::getName, Person::getAge));
        System.out.println("Unmodifiable Map: " + unmodifiableMap);

        // Attempting to modify the unmodifiable map
        try {
            unmodifiableMap.put("David", 40);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
