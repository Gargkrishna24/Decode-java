package interfaces;

interface E {
    default void fun() {
        System.out.println("make sounds");
    }
}

class F implements A {
    public void fun() {
        System.out.println("stay silent");
    }
}

public class MultiInheritance02 {
    static void main(String[] args) {
        F f = new F();
        f.fun();  // priority of class Function
    }

}
