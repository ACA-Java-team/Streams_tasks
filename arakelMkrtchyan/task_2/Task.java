import java.util.stream.Stream;

public class Task_2 {
    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1, 11);
        intStream.forEach(x -> System.out.println(x));
    }
}
