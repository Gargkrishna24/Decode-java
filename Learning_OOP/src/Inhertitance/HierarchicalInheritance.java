package Inhertitance;

public class HierarchicalInheritance {
	class Animals{
		String name;
		public Animals(String name) {
			this.name = name;
		}
		void walk() {
			System.out.println(this.name+" can walk");
		}
	}
	
	class Dog extends Animals{
		public Dog(String name) {
			super(name);
		}
	}
	class  Cat extends Animals{
		public Cat(String name) {
			super(name);
		}
	}
	
	class Cow extends Animals{
		public Cow(String name) {
			super(name);
		}
	}
	
	public static void main(String[] args) {
		HierarchicalInheritance outer = new HierarchicalInheritance();
		HierarchicalInheritance.Cat cat = outer.new Cat("Kitty");
		cat.walk();
	}

}
