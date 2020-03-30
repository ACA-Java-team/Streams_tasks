import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Task_4 {
    public static void sortAndPrintFirstElement(List<String> list){
        if(!list.isEmpty()) {
            Stream<String> stream = list.stream();
            String listFirstElement = stream.sorted().findFirst().get();
            System.out.println("First element in sorted list:");
            System.out.println(listFirstElement);
            System.out.println();

            Stream<String> stream1 = list.stream();
            System.out.println("Sorted elements whose start with 'A':");
            stream1.filter(x -> x.substring(0, 1).equals("A")).sorted().forEach(x -> System.out.println(x));
        }else{
            System.out.println("List is empty!");
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Cde");
        list.add("Bde");
        list.add("Ade");
        list.add("Aae");
        list.add("Ace");
        Task_4.sortAndPrintFirstElement(list);
    }
}
