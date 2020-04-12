package task_1_2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<>();
        persons.add(new Person("David", false));
        persons.add(new Person("Karen", true));
        persons.add(new Person("Ani", false));
        persons.add(new Person("Madagaskar", false));
        persons.add(new Person("Lili", true));

        System.out.println((int) persons.stream()
                .filter(p -> p.getName().startsWith("A"))
                .count());
    }
}

