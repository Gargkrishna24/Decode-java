package objectClass.coreMethods;

import objectClass.student;

public class GetName {
    static void main(String[] args) {
        student.Student s = new student.Student();
        Animal animal  = new Dog("German Shepherd","Krishna garg");
        System.out.println(s.getClass().getName());
        System.out.println(animal.getClass().getName());
    }
}

class Animal{
    String name;
    String owner;

    public Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }
}

class Dog extends Animal{
    public Dog(String name, String owner) {
        super(name, owner);
    }
}

//getClass() Method
//Universal Availability: It is defined in the root Object class, meaning every single object in Java automatically has this method.
//
//Returns a Class Object: Instead of returning a String, it returns an instance of java.lang.Class. This special object contains all the metadata about the blueprint of your object.
//
//Evaluates at Runtime: It always identifies the actual object created in memory, regardless of the reference type. If you write Animal a = new Dog();, calling a.getClass() will return the Dog class, not Animal.
//
//Cannot Be Overridden: Unlike toString(), equals(), and hashCode(), the getClass() method is marked as final in the Java source code. You cannot change how it works.
//
//The Gateway to Reflection: This method is the starting point for Java Reflection. Once you have the Class object, you can dynamically inspect what methods, fields, and constructors the class has while the program is running.
//
//The getName() Method
//Belongs to the Class class: You don't call this directly on your object. You call it on the metadata object returned by getClass() (e.g., myObject.getClass().getName()).
//
//Returns a String: It outputs the name of the entity (class, interface, array, etc.) as a standard text String.
//
//Fully Qualified Name: It does not just print the simple name (like "Dog"). It prints the fully qualified name, which includes the entire package structure (like "objectClass.coreMethods.Dog").
//
//Helpful for Logging: It is heavily used in logging and debugging to dynamically print exactly which class generated an error or executed a specific block of code, without hardcoding the class name.
//
//Array Formatting: If you call it on an array, it returns a unique internal syntax. For example, calling it on a one-dimensional integer array (int[]) returns "[I", and a String array returns "[Ljava.lang.String;".
