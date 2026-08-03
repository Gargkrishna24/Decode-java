package generics;
// <T extends class & interface1 , interface2>
class Test<T extends Number>{
    T valueX;
    T valueY;

    public Test(T valueX, T valueY) {
        this.valueX = valueX;
        this.valueY = valueY;
    }

    public T getValueX() {
        return valueX;
    }

    public void setValueX(T valueX) {
        this.valueX = valueX;
    }

    public T getValueY() {
        return valueY;
    }

    public void setValueY(T valueY) {
        this.valueY = valueY;
    }
    public void add(){
        System.out.println(this.valueX);
    }
}
public class UpperBound {
    static void main(String[] args) {
        Test<Integer> test = new Test<>(5,29);
        System.out.println(test.getValueX());
        System.out.println(test.getValueY());

        
    }
}
