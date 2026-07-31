package generics;
class Vehicle{
    void run(){
        System.out.println("Vehicle can run");
    }
}

class Car extends Vehicle{
    void model(){
        System.out.println("Cars have different models");
    }
}
public class DownCasting {
    static void main(String[] args) {
//        Vehicle v = new Car();
        Vehicle vehicle = new Vehicle();
        if (vehicle instanceof Car c) {
            c.model();
        } else {
            System.out.println("v is not a Car, cannot downcast safely");
        }
//        Car c = (Car) v;
//        c.model();
//        c.run();
    }
}
