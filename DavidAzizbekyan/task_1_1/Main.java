package task_1_1;

import task_1_2.Person;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<>();
        persons.add(new Person("David", false));
        persons.add(new Person("Karen", true));
        persons.add(new Person("Ani", false));
        persons.add(new Person("Madagaskar", false));
        persons.add(new Person("Lili", true));
        //1.1
        persons.stream()
                .map(Person::getName)
                .filter(p -> p.startsWith("A"))
                .forEach(System.out::println);

    }
}

