package Inhertitance;

public class DiamondProblem {
	
	static class Animal{
		void Sound() {
			System.out.println("Animal can make Sound");
		}
	}
	
	static class Dog extends Animal{
		@Override
		void Sound() {
			System.out.println("Dog can Dark");
		}
	}
	
	static class Cat extends Animal{
		void Sound() {
			System.out.println("Cat can Meow");
		}
	}
	
//	public class HybridAnimal extends Dog, Cat {
//		  public static void main(String[] args) {
//		    HybridAnimal hybrid = new HybridAnimal();
////		    hybrid.sound(); // Creates ambiguity: Should it call Dog's sound() or Cat's
//		                    // sound()?
//		  }
//		}

}
