package tasks.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class PrintSumOfNums {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,6,7,8,9,10);
        Stream<Integer> stream = list.stream();

        Optional<Integer> sum = stream.reduce((a, b) -> a + b);
        System.out.println(sum.get());
    }
}
