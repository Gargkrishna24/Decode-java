package Inhertitance;

public class MultipleInheritanceUsingInterfaces {
	class Animal{
		void Sound() {
			System.out.println("Animals make Sound");
		}
	}
	interface Mammals{
		void Sound();
	}

	interface Pets{
		void Sound();
	}
	
	class Dog extends Animal implements Mammals , Pets{
		@Override
		public void Sound() {
			System.out.println(" Dog can make sound");
		}
		
		
	}
}
