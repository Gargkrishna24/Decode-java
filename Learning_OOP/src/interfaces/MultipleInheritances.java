package interfaces;

interface A {
    void fun();

    default void makeSound() {
        System.out.println("Hurray!!");
    }
}

interface B extends A {
    void fun();

    default void makeSound() {
        System.out.println("AAAHHH!!");
    }
}

interface C extends A {
    void fun();

    default void makeSound() {
        System.out.println("Bravoo!!!");
    }
}

class D implements B, C {
    @Override
    public void fun() {
        System.out.println("Keep Smiling");
    }

    @Override
    public void makeSound() {
        System.out.println("Shittt!!!");
        C.super.makeSound();
        B.super.makeSound();
//        A.super.makeSound(); cause A is superInterface of Class D
    }
}

public class MultipleInheritances {
    static void main(String[] args) {
        D d = new D();
        d.fun();
        d.makeSound();
    }
}
