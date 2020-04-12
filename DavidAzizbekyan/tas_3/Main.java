package tas_3;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(IntStream.range(4, 11)
                .reduce((l, r) -> l + r).getAsInt());
    }
}
