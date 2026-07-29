package Inhertitance;

public class SingleInheritance {
	class Animal {
		void eat() {
			System.out.println("Eating");
		}
	}

	class Dog extends Animal {
		void bark() {
			System.out.println("The dog barks.");
		}
	}

	public static void main(String[] args) {
		SingleInheritance outer = new SingleInheritance();
		
		SingleInheritance.Dog dog =  outer.new Dog();
		dog.eat();
		dog.bark();
	}
}
