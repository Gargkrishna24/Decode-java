package objectClass.coreMethods;
import objectClass.student;

public class Equals {
    static void main(String[] args) {
         student.Student s1 = new student.Student();
         student.Student s2 = new student.Student();

         s1.name = "Krishna Garg";
         s1.rollNumber=22;

         s2.name="Krishna Garg";
         s2.rollNumber=22;

        System.out.println( s1.equals(s2));
    }
}

//Primary Purpose: It is used to compare two objects to determine if they are "equal" to one another.
//
//Default Behavior (Reference Equality): By default, the Object class implementation only compares memory addresses. It returns true only if both references point to the exact same object in memory (it acts exactly like the == operator).
//
//Custom Equality (Overriding): Developers override equals() to define logical equality. For example, you can tell Java that two different Student objects are "equal" if they share the exact same rollNumber, even if they live in different memory locations.
//
//Built-in Overrides: Core Java classes like String, Integer, and Date already have equals() overridden for you. This is why using .equals() on two different Strings with the same text returns true.
//
//The Golden Rule (hashCode): If you override equals() in a class, you must also override the hashCode() method. If you don't, hash-based collections like HashSet or HashMap will not work correctly with your objects.
//
//Null Safety: A properly written equals() method will never crash if you compare an object to null. Calling myObject.equals(null) should always safely return false.
//
//The Mathematical Contract: According to Java specifications, your overridden equals() method must be:
//
//Reflexive: An object must equal itself (x.equals(x) is true).
//
//Symmetric: If x equals y, then y must equal x.
//
//Transitive: If x equals y, and y equals z, then x must equal z.
//
//Consistent: Repeated calls must return the same result, provided the object's data hasn't changed.


