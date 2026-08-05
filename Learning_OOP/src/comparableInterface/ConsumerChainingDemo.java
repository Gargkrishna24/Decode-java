package comparableInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerChainingDemo {

    static class Order {
        int id;
        double amount;
        Order(int id, double amount) { this.id = id; this.amount = amount; }
    }

    public static void main(String[] args) {

        // ================= 1. Basic andThen() =================
        System.out.println("---- Basic andThen() ----");
        Consumer<String> print = s -> System.out.println("Printing: " + s);
        Consumer<String> log = s -> System.out.println("Logging: " + s);

        Consumer<String> printThenLog = print.andThen(log);
        printThenLog.accept("Hello");

        // Chaining multiple andThen() calls
        System.out.println("\n---- Multiple andThen() ----");
        Consumer<String> toUpper = s -> System.out.println(s.toUpperCase());
        Consumer<String> toLower = s -> System.out.println(s.toLowerCase());
        Consumer<String> printLength = s -> System.out.println("Length: " + s.length());

        Consumer<String> combined = toUpper.andThen(toLower).andThen(printLength);
        combined.accept("Hello");


        // ================= 2. Order matters =================
        System.out.println("\n---- Order Matters ----");
        Consumer<StringBuilder> appendA = sb -> sb.append("A");
        Consumer<StringBuilder> appendB = sb -> sb.append("B");

        StringBuilder sb1 = new StringBuilder();
        appendA.andThen(appendB).accept(sb1);
        System.out.println("A then B: " + sb1); // AB

        StringBuilder sb2 = new StringBuilder();
        appendB.andThen(appendA).accept(sb2);
        System.out.println("B then A: " + sb2); // BA


        // ================= 3. andThen() with forEach() =================
        System.out.println("\n---- andThen() with forEach() ----");
        List<String> names = List.of("alice", "bob", "charlie");

        Consumer<String> printOriginal = s -> System.out.println("Original: " + s);
        Consumer<String> printCapitalized = s ->
                System.out.println("Capitalized: " + s.substring(0, 1).toUpperCase() + s.substring(1));

        names.forEach(printOriginal.andThen(printCapitalized));


        // ================= 4. BiConsumer.andThen() =================
        System.out.println("\n---- BiConsumer.andThen() ----");
        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 75);

        BiConsumer<String, Integer> printEntry = (name, score) ->
                System.out.println(name + " scored " + score);
        BiConsumer<String, Integer> flagLowScore = (name, score) -> {
            if (score < 80) System.out.println("  -> " + name + " needs improvement");
        };

        scores.forEach(printEntry.andThen(flagLowScore));


        // ================= 5. Validation + Logging Pipeline =================
        System.out.println("\n---- Validation + Logging Pipeline ----");
        Consumer<Order> validate = order -> {
            if (order.amount <= 0) throw new IllegalArgumentException("Invalid amount");
        };
        Consumer<Order> logOrder = order ->
                System.out.println("Processing order #" + order.id + " for $" + order.amount);
        Consumer<Order> applyDiscount = order -> {
            if (order.amount > 100) order.amount *= 0.9;
        };
        Consumer<Order> printFinal = order ->
                System.out.println("Final amount: $" + order.amount);

        Consumer<Order> pipeline = validate.andThen(applyDiscount)
                .andThen(logOrder)
                .andThen(printFinal);

        pipeline.accept(new Order(1, 150));
    }
}
