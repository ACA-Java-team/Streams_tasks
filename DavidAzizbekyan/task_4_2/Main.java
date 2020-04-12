package task_4_2;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(Arrays.asList("David","Armen","Suren"));
        names.stream()
                .filter(p->p.toLowerCase().startsWith("a"))
                .sorted()
                .forEach(System.out::println);
    }
}
