package interfaces;
interface Animal{
    void voice();
}
interface Dog extends Animal{
    void bark();
}
public class Basics02 implements Dog {
    @Override
    public void bark() {
        System.out.println("Dog is Barking");
    }

    @Override
    public void voice() {
        System.out.println("Animal creates sound");
    }
}
