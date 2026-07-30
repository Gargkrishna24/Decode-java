package interfaces;

interface Vehicle{
    default void start(){
        System.out.println("start!!");
        accelerate();
    }

    static void brake(){
        System.out.println("Brake");
    }

    private void accelerate(){
        System.out.println("Bus is accelerating");
    }
}

class Bus implements Vehicle{

   @Override
    public void start(){
       System.out.println("Bus is start");

   }

}
public class InterfacesAfterJava8AndJava9 {
    static void main(String[] args) {
        Vehicle bus = new Bus();
        bus.start();
        Vehicle.brake();
    }
}
