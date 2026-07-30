package objectClass.coreMethods;
import objectClass.student;

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
