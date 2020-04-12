package task_4_1;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(Arrays.asList("David","Armen","Suren"));
        names.stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
