import java.util.stream.Stream;

public class Task_2 {
    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        stream.forEach(x -> System.out.println(x));

        IntStream intStream = IntStream.range(1, 11);
        intStream.forEach(x -> System.out.println(x));
    }
}
