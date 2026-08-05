package comparableInterface;
import java.util.function.Function;

public class FunctionalComposition {
    static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();

//        Function<Integer,Integer> fun = x->((x+1)*2);
//
//        System.out.println(fun.apply(5));

        Function<Integer , Integer> part1 = x->x+1;
        Function<Integer , Integer> part2 = x->x*2;
        Function<Integer , Integer> part3 = x->x/2;

        int a = part1.apply(5);
        int b = part2.apply(a);

//        System.out.println(b);


        int ans = part2.apply(part1.apply(5));
//        System.out.println(ans);

        int ans1 = part1.andThen(part2).andThen(part3).apply(5);
        System.out.println(ans1);

    }
}
