import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task_1 {
    private static class Person{
        private String name;
        Person(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Arakel"));
        personList.add(new Person("Armen"));
        personList.add(new Person("Nara"));
        personList.add(new Person("Anahit"));
        personList.add(new Person("Gevorg"));
        personList.add(new Person("Areg"));

        Stream<Person> stream = personList.stream();
        System.out.println("Persons whose names start with latter 'A':");
        stream.filter(x -> x.name.substring(0,1).equals("A")).forEach(x -> System.out.println(x.name));

        Stream<Person> stream1 = personList.stream();
        System.out.println("Number of Persons whose names start with latter 'A':");
        System.out.println(stream1.filter(x -> x.name.substring(0, 1).equals("A")).count());
    }
}
