package objectClass;

import java.util.Objects;

public class student {
    public static class Student{
        public String name;
        public int rollNumber;

        @Override
        public String toString(){
            return (this.name + " , " + this.rollNumber);
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if(obj == null) {
                return false;
            }
            // Check if both classes are of type Student
            // If not checked --> ClassCastExceptions
            if(obj.getClass() != this.getClass()) {
                return false;
            }
            Student s = (Student) obj;
            return (this.name == s.name && this.rollNumber == s.rollNumber);
        }

        @Override
        public int hashCode() {
            // int result = 17;
            // result = result * 31 + age;
            // result = result * 31 + ((name == null) ? 0 : name.hashCode());

            // return result;

            return Objects.hash(name, rollNumber);
        }
    }
}
