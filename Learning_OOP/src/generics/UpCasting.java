package generics;

class Animal{
    void walk(){
        System.out.println("Animals can walk");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark !!");
    }
}

public class UpCasting {
    static void main(String[] args) {
        Dog d = new Dog();
        Animal a = d;
        a.walk();
//        a.bark();
    }
}
