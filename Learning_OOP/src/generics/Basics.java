package generics;
class Box{
    private Object value;

    public Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
public class Basics {
    static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box("Krishna ");
        Box b3 = new Box(false);
        System.out.println(b1.getValue());
        System.out.println(b2.getValue());
        System.out.println(b3.getValue());
//        System.out.println(b1.getValue()+5);
//        System.out.println(b2.getValue()+5);
//        System.out.println(b3.getValue());

        System.out.println("Operation after DownCasting ");

        Integer a = (Integer) b1.getValue() + 5;
        String b = (String) b2.getValue()+5;
        Boolean c = (Boolean) b3.getValue();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
