package stream;

import java.util.ArrayList;
import java.util.List;


public class Basics {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.stream().
                filter(x -> x > 2).
                map(x -> x * 2).
                filter(x -> x > 2).
                forEach(System.out::println);

    }
}
