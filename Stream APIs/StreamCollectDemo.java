//Use of Collectors.toList(), Stream.collect(), Stream.filter()
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        List<Integer> list = stream.filter(n -> n % 2 == 0).map(n -> n * 3).collect(Collectors.toList());

        System.out.println(list);
    }
}
