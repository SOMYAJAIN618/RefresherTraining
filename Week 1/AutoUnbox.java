import java.io.*;
import java.util.*;

public class AutoUnbox {
    public static int sumOfEvenNumber(List<Integer> numbers)
    {
        int sum = 0;

        for (Integer i : numbers) {

            // Unboxing of i, method 1
            if (i % 2 == 0)
                sum += i;

            // using intvalue implicitly, method 2
//            if (i.intValue() % 2 == 0)
//                sum += i.intValue();
        }
        return sum;
    }

    public static void main(String[] args)
    {
        List<Integer> number = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++)
            number.add(i);

        int sumEven = sumOfEvenNumber(number);

        System.out.println("Sum of even numbers = "
                + sumEven);
    }
}
