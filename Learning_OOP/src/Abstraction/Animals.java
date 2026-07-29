package Abstraction;

abstract class Animal {
	abstract void makeSound();

	public void sleeping() {
		System.out.println("Slepping....ZZZZZ!!");
	}

}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Bark");
	}
}

class Animals{
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sleeping();
		dog.makeSound();
	}
}
