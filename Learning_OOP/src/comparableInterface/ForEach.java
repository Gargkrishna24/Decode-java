package comparableInterface;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,8));

        list.forEach(x-> System.out.print(x + " "));
        System.out.println();
        // Method reference
        System.out.println("Using Method reference ");

        list.forEach(System.out::println);
    }

}
