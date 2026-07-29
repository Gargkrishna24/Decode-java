package Encapsulation;

public class Student {

    static final String COLLEGE;
    static final String CITY;

    static {
        COLLEGE = "GLA University";
        CITY = "Agra";
    }

    // 1. Private variables (Encapsulation)
    private String name;       // Mandatory
    private int rollNumber;    // Mandatory
    private int age;           // Optional
    private int marks;         // Optional

    // 2. CONSTRUCTOR: Only accepts the MANDATORY fields
    // You cannot create a Student without providing a name and roll number.
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // 3. GETTERS for all fields
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    // 4. SETTERS: Only for the OPTIONAL fields (or fields that are allowed to change)
    // Notice there is no setRollNumber() because a roll number usually shouldn't change!

    public void setAge(int age) {
        if (age > 0) { // Example of validation
            this.age = age;
        }
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) { // Example of validation
            this.marks = marks;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", age=" + age +
                ", marks=" + marks +
                ", College='" + COLLEGE + '\'' +
                ", City='" + CITY + '\'' +
                '}';
    }

    // 5. Execution
    public static void main(String[] args) {

        // Step A: Create the object with the mandatory data.
        // The object is immediately valid and usable.
        Student s1 = new Student("Krishna Garg", 36);

        // Step B: Add the optional data later using setters.
        s1.setAge(22);
        s1.setMarks(95);

        System.out.println(s1);
    }
}