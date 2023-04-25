package ReflectionImplementation;

import ReflectionImplementation.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflection {
    public static void main(String[] args) {
        Reflection reflection1 = Reflection.getInstance();
        Reflection reflection2 = null;


        try {
            Constructor<Reflection> constructor = Reflection.class.getDeclaredConstructor(); //constructor object of reflection class
            constructor.setAccessible(true); //setting accessibility which is by default false
            reflection2 = constructor.newInstance(); //invoking singleton principle
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

        // Check if both instances are same
        System.out.println(reflection1.hashCode());
        assert reflection2 != null;
        System.out.println(reflection2.hashCode());
    }
}
