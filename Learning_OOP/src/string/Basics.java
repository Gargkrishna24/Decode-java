package string;

public class Basics {
    static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1==s2); // true

        String s3 = "Mukund";
        String s4 = s3 + "Bansal";
        String s5 = "Mukund Bansal";

        System.out.println(s5==s4);

        String s6 = "Krishna garg";
        String s7 = s6;

        System.out.println(s6==s7);


        String s8 = "Raju";
        s8 = "lion";

        System.out.println(s8);

        String s9 = new String("Nikhil");
        String s10 = "Nikhil";

        System.out.println(s9==s10); // nikhil is available at both Memory location heap and string pool
    }
}
