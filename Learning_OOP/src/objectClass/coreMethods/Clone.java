package objectClass.coreMethods;
import objectClass.student;
//Inherited from Object — every class in Java implicitly has access to clone() since it's defined in java.lang.Object.
//Creates a copy of an object — produces a new object with the same field values as the original, without calling any constructor.
//Protected and native — the default clone() in Object is protected and marked native (implemented in the JVM itself, not in Java bytecode).
//Requires Cloneable marker interface — the class must implement Cloneable. This interface has no methods; it just acts as a flag. Without it, Object.clone() throws CloneNotSupportedException at runtime.
//Must be overridden to be usable outside the class — since it's protected in Object, you typically override it as public in your own class to call it from outside.
//Performs a shallow copy by default
//Primitive fields are copied by value.
//Reference fields (objects, arrays, collections) are copied by reference — both original and clone point to the same underlying object.
//For a true independent copy of nested objects, you must manually clone those fields too (deep copy).
//Bypasses constructors — unlike new Student(), clone() doesn't run any constructor logic; it copies memory/field state directly.
//Throws CloneNotSupportedException — a checked exception, thrown if Cloneable isn't implemented; must be caught or declared.
//Returns Object — so the result must be explicitly cast back to the original type:
//java
//Student s2 = (Student) s1.clone();
//Not always recommended — many developers (including Joshua Bloch in Effective Java) consider clone() a flawed design. Common alternatives:
//Copy constructors
//Static factory methods
//Serialization-based deep copy
//Libraries like Apache Commons SerializationUtils
public class Clone  implements Cloneable {
    static void main(String[] args) throws CloneNotSupportedException {
        student.Student s1 = new student.Student();
        s1.name = "Mukund Bansal";
        s1.rollNumber=24;
        student.Student s2 = (student.Student) s1.clone();
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

    }
}
