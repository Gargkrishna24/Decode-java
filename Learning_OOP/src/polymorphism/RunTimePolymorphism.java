package polymorphism;

public class RunTimePolymorphism {

    // Parent Class
    class Animals {
        String category;
        String name;

        public Animals(String category, String name) {
            this.category = category;
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Parent voice method
        public void voice() {
            System.out.println("Animal makes a sound");
        }

        @Override
        public String toString() {
            return "Animals [category=" + category + ", name=" + name + "]";
        }
    }

    // ✅ Dog EXTENDS Animals — proper inheritance
    class Dog extends Animals {

        public Dog(String category, String name) {
            super(category, name); // ✅ calls Animals constructor
        }

        // ✅ Now override works — Dog IS-A Animals
        @Override
        public void voice() {
            System.out.println("Bark!!!");
        }
    }

    // ✅ Cat EXTENDS Animals
    class Cat extends Animals {

        public Cat(String category, String name) {
            super(category, name);
        }

        @Override
        public void voice() {
            System.out.println("Meow!!!");
        }
    }

    public static void main(String[] args) {

        RunTimePolymorphism outer = new RunTimePolymorphism();

        // ✅ Runtime Polymorphism
        // Parent reference → Child object
        RunTimePolymorphism.Animals a1 = outer.new Dog("Mammal", "Tommy");
        RunTimePolymorphism.Animals a2 = outer.new Cat("Mammal", "Kitty");
        RunTimePolymorphism.Animals a3 = outer.new Animals("Unknown", "Generic");

        // Same method — different behaviour! ✅
        a1.voice(); // Bark!!!
        a2.voice(); // Meow!!!
        a3.voice(); // Animal makes a sound

        System.out.println("---");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}