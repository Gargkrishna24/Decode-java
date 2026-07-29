package nestedClasses.innerclasses;

public class Basics {

    // FIX 1: All executable logic must be inside a method like 'main'
    public static void main(String[] args) {

        // Step 1: Create the outer object first.
        // We are setting the outer object's state (x=5, y=6).
//        Outer outer = new Outer(5, 6);

        // Step 2: Create the inner object using the specific outer object.
        // Notice the syntax: outer.new Inner()
        // This permanently links this 'inner' object to the 'outer' object above.
//        Outer.Inner inner = outer.new Inner();

        Outer.Inner inner = new Outer(5,6).new Inner();
        // FIX 2: Added a print statement and the missing semicolon to see the result.
        System.out.println("The sum is: " + inner.sum());
    }
}

class Outer {
    // Instance variables belonging to the Outer class
    int x;
    int y;

    public Outer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // ---------------------------------------------------------
    // Because this class does NOT have the 'static' keyword,
    // it is a true "Inner Class". It is intimately tied to the
    // specific Outer object that creates it.
    // ---------------------------------------------------------
    class Inner {

        // FIX 3: Removed the parameters (int x, int y)
        int sum() {
            // ---------------------------------------------------------
            // THE SUPERPOWER:
            // We can just type 'x' and 'y'. The compiler automatically
            // knows we mean the 'x' and 'y' from the connected Outer object.
            // Behind the scenes, Java is actually reading this as:
            // return Outer.this.x + Outer.this.y;
            // ---------------------------------------------------------
            return x + y;
        }
    }
}