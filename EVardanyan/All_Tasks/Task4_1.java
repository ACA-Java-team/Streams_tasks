package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Task4_1{
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
//        test.add("asldkh");
//        test.add("sdfsdfw");
//        test.add("dfsggs");
//        test.add("cvzxczxc");
        sortAndPrintFirstElement(test);
    }
    //-------------------sorting and get first element after checking isEmpty list------
    static void sortAndPrintFirstElement(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("Your list is empty and how u imagine how i can sort empty list are you a serious >");
        } else {
            list.sort(Comparator.naturalOrder());
            System.out.println(list.get(0));
        }
    }
}