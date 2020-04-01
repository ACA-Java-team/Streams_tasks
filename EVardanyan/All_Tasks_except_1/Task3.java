package Task2;

import java.util.List;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(4,5,6,7,8,9,10);
        System.out.println(integers.stream().reduce(0, Integer::sum));

    }
}
