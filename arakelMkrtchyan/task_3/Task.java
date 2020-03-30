import java.util.stream.Stream;

public class Task_3 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(4, 5, 6, 7, 8, 9, 10);
        Integer sum = stream.reduce(0, (a,b) -> a + b);
        System.out.println(sum);
    }
}
