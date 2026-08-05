package comparableInterface;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateChainingDemo {

    public static void main(String[] args) {

        // ================= 1. and() =================
        System.out.println("---- and() ----");
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);

        System.out.println(isPositiveAndEven.test(4));   // true
        System.out.println(isPositiveAndEven.test(-4));  // false
        System.out.println(isPositiveAndEven.test(3));   // false

        // Chaining multiple and()
        Predicate<String> notNullStr = s -> s != null;
        Predicate<String> notEmptyStr = s -> !s.isEmpty();
        Predicate<String> minLength = s -> s.length() >= 5;
        Predicate<String> validPassword = notNullStr.and(notEmptyStr).and(minLength);

        System.out.println(validPassword.test("hello123")); // true
        System.out.println(validPassword.test("hi"));        // false


        // ================= 2. or() =================
        System.out.println("\n---- or() ----");
        Predicate<Integer> isNegative = n -> n < 0;
        Predicate<Integer> isZero = n -> n == 0;
        Predicate<Integer> isNonPositive = isNegative.or(isZero);

        System.out.println(isNonPositive.test(-5)); // true
        System.out.println(isNonPositive.test(0));  // true
        System.out.println(isNonPositive.test(5));  // false

        // Chaining and() + or() together
        Predicate<Integer> divisibleBy3 = n -> n % 3 == 0;
        Predicate<Integer> divisibleBy5 = n -> n % 5 == 0;
        Predicate<Integer> combined = isPositive.and(divisibleBy3.or(divisibleBy5));

        System.out.println(combined.test(15));  // true
        System.out.println(combined.test(-15)); // false
        System.out.println(combined.test(7));   // false


        // ================= 3. negate() =================
        System.out.println("\n---- negate() ----");
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        System.out.println(isNotEmpty.test("hello")); // true
        System.out.println(isNotEmpty.test(""));      // false

        Predicate<Integer> isOdd = isEven.negate();
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        System.out.print("Odd numbers: ");
        nums.stream().filter(isOdd).forEach(n -> System.out.print(n + " "));
        System.out.println();


        // ================= 4. Predicate.isEqual() =================
        System.out.println("\n---- Predicate.isEqual() ----");
        Predicate<String> isJava = Predicate.isEqual("Java");

        System.out.println(isJava.test("Java"));   // true
        System.out.println(isJava.test("Python")); // false
        System.out.println(isJava.test(null));     // false (null-safe)

        List<String> languages = List.of("Java", "Python", "Java", "C++");
        long count = languages.stream()
                .filter(Predicate.isEqual("Java"))
                .count();
        System.out.println("Count of 'Java': " + count); // 2


        // ================= 5. Predicate.not() =================
        System.out.println("\n---- Predicate.not() ----");
        List<String> strings = Arrays.asList("", "foo", "", "bar");

        System.out.print("Non-empty strings: ");
        strings.stream()
                .filter(Predicate.not(String::isEmpty))
                .forEach(s -> System.out.print(s + " "));
        System.out.println();


        // ================= 6. Full combined example =================
        System.out.println("\n---- Full Combined Example ----");
        List<String> names = Arrays.asList("Alice", "", "Bob", "Alexander", null, "Al");

        Predicate<String> notNull = Objects::nonNull;
        Predicate<String> notEmpty = Predicate.not(String::isEmpty);
        Predicate<String> startsWithA = s -> s.startsWith("A");
        Predicate<String> longerThan3 = s -> s.length() > 3;

        // notNull must come first to avoid NPE on later predicates
        Predicate<String> filterChain = notNull
                .and(notEmpty)
                .and(startsWithA)
                .and(longerThan3);

        List<String> result = names.stream()
                .filter(filterChain)
                .collect(Collectors.toList());

        System.out.println(result); // [Alice, Alexander]
    }
}
