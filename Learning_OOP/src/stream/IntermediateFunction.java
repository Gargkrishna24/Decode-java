package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateFunction {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,22,33,12,32,5,-1,322,1,2,2,1,2,1,2,1,2,1,2,3,12));
        list.stream().
                filter(x->x>0).
                map(x->x*2).
                sorted(). // stateful
                distinct(). // stateful
                forEach(System.out::println);

        List<List<Integer>> list2 = new ArrayList<>(List.of(
                List.of(1,2,3),
                List.of(4,5,6)
        ));
        list2.stream().flatMap(x->x.stream()).sorted((a,b)->b-a).forEach(System.out::println);


        System.out.println("-----------------------------------------");

        Stream.iterate(1, x->x+4)
                .limit(20)
                .peek(System.out::println)
                .skip(10)
                .forEach(System.out::println);


    }
}
