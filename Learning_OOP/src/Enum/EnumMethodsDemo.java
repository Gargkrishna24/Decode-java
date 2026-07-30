package Enum;
enum Directionss {
    North, East, South, West;
}

public class EnumMethodsDemo {
    public static void main(String[] args) {

        // 1. values() -> returns an array of all enum constants, in declaration order
        Direction[] allDirections = Direction.values();
        System.out.println("---- values() ----");
        for (Direction d : allDirections) {
            System.out.println(d);
        }

        // 2. name() -> returns the exact name of the constant as a String
        Direction d1 = Direction.North;
        System.out.println("\n---- name() ----");
        System.out.println("Name: " + d1.name());   // "North"

        // 3. ordinal() -> returns the position (index) of the constant, starting from 0
        System.out.println("\n---- ordinal() ----");
        System.out.println(Direction.North.ordinal()); // 0
        System.out.println(Direction.East.ordinal());  // 1
        System.out.println(Direction.South.ordinal()); // 2
        System.out.println(Direction.West.ordinal());  // 3

        // 4. valueOf() -> converts a String back into the matching enum constant
        System.out.println("\n---- valueOf() ----");
        Direction d2 = Direction.valueOf("East");
        System.out.println("Converted: " + d2);

        // valueOf() throws IllegalArgumentException if the string doesn't match exactly
        try {
            Direction d3 = Direction.valueOf("Northeast");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: No enum constant named 'Northeast'");
        }
    }
}