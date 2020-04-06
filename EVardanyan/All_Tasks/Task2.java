package Task2;

import combinatorpattern.Customer;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        IntStream.range(0, 11).forEach(
                num -> System.out.print(num + "  ")
        );

    }


}
