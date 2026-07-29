package nestedClasses.staticClasses;

public class Basics {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        Outer outer = new Outer("Krishna garg", 24);

        // ---------------------------------------------------------
        // RULE: Independence from the Outer Object
        // Notice the syntax below: We use `Outer.Inner` to declare it,
        // and `new Outer.Inner(...)` to instantiate it.
        // We do NOT need to write `outer.new Inner()`. The nested class
        // stands independent of the outer object's creation mechanics.
        // ---------------------------------------------------------
        Outer.Inner inner = new Outer.Inner(outer);

        inner.details();
    }
}

class Outer {
    // ---------------------------------------------------------
    // RULE: Private Member Access
    // I marked this static variable as 'private'. Normally, nothing
    // outside this class could touch it. But a static nested class
    // inside it is allowed full access to private static members.
    // ---------------------------------------------------------
    private static String name;

    // Instance (non-static) variable
    int age;

    Outer(String name, int age) {
        Outer.name = name;
        this.age = age;
    }

    // ---------------------------------------------------------
    // RULE: The Correct Terminology & Main Use Case
    // Because of the 'static' keyword, this is technically a
    // "Static Nested Class". It acts as a helpful grouping mechanism.
    // ---------------------------------------------------------
    static class Inner {

        // ---------------------------------------------------------
        // RULE: Accessing Non-Static Members
        // Because a static nested class cannot directly touch non-static
        // data from the Outer class, we must manually pass an Outer
        // object into this nested class and store it if we want to
        // interact with instance variables (like 'age').
        // ---------------------------------------------------------
        Outer outer;

        public Inner(Outer outer) {
            this.outer = outer;
        }

        void details() {
            // ---------------------------------------------------------
            // RULE: Strict Access Limitations
            // We CANNOT just print 'age' directly here. It would cause a
            // compiler error. We MUST use our stored object reference
            // (this.outer.age) to access it.
            //
            // However, we CAN access 'name' directly because it is static
            // (and we can bypass its 'private' restriction).
            // ---------------------------------------------------------
            System.out.println("My name is " + name + " And I am only " + this.outer.age + " Years old");
        }
    }
}