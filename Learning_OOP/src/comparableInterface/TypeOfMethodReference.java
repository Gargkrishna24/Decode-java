package comparableInterface;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;

public class TypeOfMethodReference {
    static void main(String[] args) {
        List<String> stringNumbers = List.of("10", "20", "30");
//. Reference to a Static Method
// Lambda equivalent: str -> Integer.parseInt(str)
        List<Integer> integers = stringNumbers.stream()
                .map(Integer::parseInt)
                .toList(); // Output: [10, 20, 30]

 //2. Reference to an Instance Method of a Particular Object (object::instanceMethod)

        List<String> fruits = List.of("Apple", "Banana", "Cherry");
        PrintStream printer = System.out; // Specific object instance

// Lambda equivalent: fruit -> printer.println(fruit)
        fruits.forEach(printer::println);

// Commonly written directly using System.out:
        fruits.forEach(System.out::println);


        //3. Reference to an Instance Method of an Arbitrary Object (Class::instanceMethod)

        List<String> names = List.of("charlie", "alice", "bob");

// Mapping: Target element becomes 'name' in name.toUpperCase()
// Lambda equivalent: name -> name.toUpperCase()
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .toList(); // [CHARLIE, ALICE, BOB]

// Sorting: 'a' becomes the target object calling compareToIgnoreCase('b')
// Lambda equivalent: (a, b) -> a.compareToIgnoreCase(b)
        List<String> sortedNames = new ArrayList<>(names);
        sortedNames.sort(String::compareToIgnoreCase); // [alice, bob, charlie]


//        4. Reference to a Constructor (Class::new)
        List<String> rawNames = List.of("Alice", "Bob", "Charlie");

// Example A: Mapping strings to Person instances
// Lambda equivalent: name -> new Person(name)
//        List<Person> people = rawNames.stream()
//                .map(Person::new)
//                .toList();
//
//// Example B: Collecting stream output into a custom collection (HashSet)
//// Lambda equivalent: () -> new HashSet<>()
//        Set<String> uniqueNames = rawNames.stream()
//                .collect(Collectors.toCollection(HashSet::new));
    }
}
