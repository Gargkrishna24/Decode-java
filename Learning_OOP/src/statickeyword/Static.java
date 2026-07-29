package statickeyword;

public class Static {

    static void main(String[] args) {
        Student s1 = new Student("Krishna Garg", 36, 22);
        Student s2 = new Student("Krishna Garg", 36, 22);
        Student.markPresent(s1.name);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Student {
    static {
        college = "GLA University";
        location = "Mathura,Uttar Pradesh";
    }

    String name;
    int rollNumber;
    int age;
    static String college;
    static String location;

    Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    static void markPresent(String name) {
        System.out.println(name + " Present ");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", age=" + age +
                ",College=" + Student.college +
                ",loaction=" + Student.location +
                '}';
    }
}

