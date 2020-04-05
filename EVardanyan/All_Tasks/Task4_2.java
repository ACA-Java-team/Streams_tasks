package Task2;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task4_2 {
    public static void main(String[] args) {
        List<String> people = List.of("Edgar","asdasd","Zasdasd","reqer", "Mr Wolf", "Joker", "aryuy", "asfdf");
       filterAndSorting(people);

//-------------------The Same thing just using Stream-------------------
//        people.stream()
//                .filter(x -> !(x.startsWith("a") || x.startsWith("A")))
//                .sorted()
//                .forEach(System.out::println);


    }
    //--------------------Function for filtering and sorting----------------------------//

    static  void filterAndSorting(List<String> list) {
        List<String> results = new ArrayList<>();
        Predicate <String> p =  x ->x.startsWith("A") || x.startsWith("a");
        for (String x : list) {
            if (!p.test(x)) {
                results.add(x);
            }
        }
        results.sort(Comparator.naturalOrder());
        results.forEach(System.out::println);

        }
    }
