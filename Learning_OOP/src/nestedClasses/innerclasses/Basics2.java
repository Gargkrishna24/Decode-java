package nestedClasses.innerclasses;

public class Basics2 {
    static void main(String[] args) {
        A.B b = new A().new B();
        b.fun();
    }
}

class A {
    int x = 10;

    class B {
        int x = 4;
        void fun(){
            System.out.println("x = " + A.this.x);
        }
    }
}
