package polymorphism;

public class CompileTimeOrStatic {
    String name;
    int rollNumber;
    int age;
    int[] marks;
    int noOfSubjects;

    // Constructor 1 — takes name, rollNumber, age
    public CompileTimeOrStatic(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    // Constructor 2 — takes noOfSubjects and marks array
    // calls Constructor 1 with default values ✅
    public CompileTimeOrStatic(int noOfSubjects, int[] marks) {
        this("Unknown", 0, 0); // ✅ calls Constructor 1 — different constructor!
        this.noOfSubjects = noOfSubjects;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("No of Subjects: " + noOfSubjects);
    }

    public static void main(String[] args) {

        // Using Constructor 1
        CompileTimeOrStatic student1 = new CompileTimeOrStatic("Raj", 101, 20);
        student1.display();

        System.out.println("---");

        // Using Constructor 2
        CompileTimeOrStatic student2 = new CompileTimeOrStatic(5, new int[]{90, 80, 70, 60, 50});
        student2.display();
    }
}