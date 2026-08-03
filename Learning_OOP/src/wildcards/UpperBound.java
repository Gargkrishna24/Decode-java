package wildcards;

import java.util.ArrayList;
import java.util.List;

// Wildcard with upper bound (extends )

public class UpperBound {
    public static void main(String[] args) {
        List<Dogg> dogs = new ArrayList<>();
        dogs.add(new Dogg());
        dogs.add(new Dogg());

        // List<Animal> animals = new ArrayList<>();
        // animals.add(new Animal());
        // animals.add(new Animal());

        // List<Integer> l = new ArrayList<>();

        fun(dogs);
    }

    static void fun(List<? extends Animal> values) {
        // for(Animal a : values) {
        // a.eat();
        // }

        //values.add(new Dog());
    }
}

class Animall {
    void eat() {
        System.out.println("Animal Eating");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class Dogg extends Animal {
    @Override
    void eat() {
        System.out.println("Dog Eating");
    }

    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {

}
