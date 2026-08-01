package generics;

class  Container <T>{
    private T container;

    public Container(T container) {
        this.container = container;
    }

    public T getContainer() {
        return container;
    }

    public void setContainer(T container) {
        this.container = container;
    }
}
public class Generics {
    static void main(String[] args) {
        Container<Integer> x = new Container<>(10);
        Container<String> y = new Container<>("Krishna garg");
        Container<Boolean> z = new Container<>(false);
        System.out.println(x.getContainer()+5);
        System.out.println(y.getContainer()+ " , Hello");
        System.out.println(z.getContainer());
    }

}
