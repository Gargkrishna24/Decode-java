package interfaces;
interface Car{
    void move();
}
interface CarVariables{
    int model = 2134;
}
abstract class Thar implements Car{
    public abstract void move();
}
class BlackThar implements Car{
    @Override
    public void move(){
        System.out.println("Black Thar is Moving");
    }
}
public class Basic {
    static void main(String[] args) {
        Car car = new BlackThar();
        car.move();
    }
}
