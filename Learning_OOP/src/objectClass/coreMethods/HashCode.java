package objectClass.coreMethods;

import objectClass.student;

public class HashCode {

    static void main(String[] args) {
        student.Student s1 = new student.Student();
        student.Student s2 = new student.Student();
        s1.name="Krishna Garg";
        s2.name = "Krishna Garg";

        s1.rollNumber = 1;
        s2.rollNumber=1;

        boolean result = s1.hashCode() == s2.hashCode();
        System.out.println("result = " + result);

        System.out.println(s1.equals(s2));
    }
}

//Primary Purpose: It returns an integer (a mathematical hash) that represents the object.
//
//Built for Performance: Its main job is to help hash-based data structures, like HashMap and HashSet, organize and find objects almost instantly. The hash code determines which "bucket" the collection should put the object into.
//
//Default Behavior: The default Object implementation typically generates this integer by converting the object's internal memory address. This means two separate objects will naturally have two different hash codes.
//
//The Ironclad Contract: If you override equals() so that two objects are considered equal, they must return the exact same hashCode(). If you break this rule, hash-based collections will lose your objects entirely.
//
//Consistency Rule: As long as you do not change the data used in the equals() comparison, calling hashCode() on the same object multiple times during an application's runtime must consistently return the exact same integer.
//
//Collisions are Permitted: If two objects are not equal, it is completely legal for them to share the same hash code (this is known as a hash collision).
//
//Best Practice for Collisions: While collisions are allowed, a well-written hashCode() method tries to generate unique integers for unequal objects. Too many collisions force hash maps to work harder, slowing down data retrieval.
