package tasks.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Andrew");
        names.add("Maria");
        names.add("Simon");
        names.add("Nick");
        names.add("Amanda");

        sortAndPrintFirstElement(names);
        printFirstElemStartsWithA(names);
    }
    static void sortAndPrintFirstElement(List<String> list) {

        Stream<String> stream = list.stream();
        stream.sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }

    static void printFirstElemStartsWithA(List<String> list) {
        Stream<String> stream = list.stream();
        stream.filter((s) -> s.charAt(0) == 'A')
                .sorted()
                .forEach(System.out::println);
    }
}
