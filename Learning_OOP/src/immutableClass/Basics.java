package immutableClass;

public class Basics {
    static void main(String[] args) {
        College college = new College("GLA", "Mathura");
        Student student = new Student("Krishna garg",22,college);
        student.getCollege().name="GL BAJAJ";
        System.out.println(student.getCollege().name);
    }
}

final class Student {
    private String name;
    private int age;
    private College college;

    Student(String name, int age, College college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public College getCollege() {
        return college;
    }
}

class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
