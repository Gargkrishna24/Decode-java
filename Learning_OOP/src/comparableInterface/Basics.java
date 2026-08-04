package comparableInterface;
//Integer already implements Comparable<Integer> internally (Java's built-in wrapper classes do this) — that's why Collections.sort(l1) works fine. It knows 3 < 2 etc. by natural numeric ordering.
//Student is your own custom class. You never told Java how to compare two Student objects — is it by marks? By name? Java has no idea. So Student does not implement Comparable, and Collections.sort(l) fails to compile with an error like:
import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }
}
public class Basics {
    static void main(String[] args) {
        List<Student> l = new ArrayList<>();
        l.add(new Student("Krishna garg",99));
        l.add(new Student("Mukund Bansal",18));
        l.add(new Student("Nikhil Gupta",-23));
        Collections.sort(l);
        for(Student s : l){
            System.out.println(s.name+" " + s.marks);
        }


        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(2);
        l1.add(98);

        Collections.sort(l1);

    }
}
