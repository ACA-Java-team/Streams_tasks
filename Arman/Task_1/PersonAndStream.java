package tasks.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PersonAndStream {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John"));
        personList.add(new Person("Andrew"));
        personList.add(new Person("Maria"));
        personList.add(new Person("Simon"));
        personList.add(new Person("Nick"));
        personList.add(new Person("Amanda"));


        Stream<Person> personStream = personList.stream();
        personStream.filter(person -> person.getName().charAt(0) == 'A')
                    .forEach(person -> System.out.println(person.getName()));

        personStream = personList.stream();
        long count = personStream.filter(person -> person.getName().charAt(0) == 'A').count();
        System.out.println(count);
    }
}
