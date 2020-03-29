package Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("John", "Smith"),
                new Person("Maria", "Simpson" ),
                new Person("Alex", "Grig"),
                new Person("Alice", "Ratakowski")
        );

        System.out.println(list.stream()
                        .map(Person::getFirstName)
                        .filter(x->x.startsWith("A")).
                         count()
        );



        }


            
        }


