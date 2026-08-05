package comparableInterface;
import java.util.function.*;
public class FunctionInterface {
    static void main(String[] args) {
        Function<Integer , Integer> square = x->x*x;
//        System.out.println(square.apply(5));

        Consumer<Integer> consumer = (x-> System.out.println("Print the  value of X "+ x));
//        consumer.accept(5);

        Supplier<Double> supply = ()->  Math.random();
//        System.out.println(supply.get());

        Predicate<Integer> predicate = (x)-> x%2==0;
        System.out.println(predicate.test(5));
    }
}
