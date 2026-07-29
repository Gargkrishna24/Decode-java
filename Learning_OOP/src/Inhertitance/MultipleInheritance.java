package Inhertitance;

public class MultipleInheritance {
	class Animals {
		void eat() {
			System.out.println("This animal can eat");
		}

	}

	class Mammals extends Animals {
		void walk() {
			System.out.println("this Animal can also walks");
		}
	}

	class Dog extends Mammals {
		void voice() {
			System.out.println("Dogs can barks");
		}
	}

	public static void main(String[] args) {
		MultipleInheritance outer = new MultipleInheritance();
		MultipleInheritance.Mammals mammals = outer.new Mammals();
		mammals.eat();
		mammals.walk();

		MultipleInheritance.Dog dog = outer.new Dog();
		dog.eat();
		dog.walk();
		dog.voice();
	}

}
