package generics;
class Demo <T,U>{
    private T first;
    private U second;

    public Demo(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public  U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
    // Method BluePrint
//    [access modifier] [static] <T> [return type] methodName(T parameter) {
//        // method body
//    }

    public  <E> E getArgument(E args){
        return args;
    }

    public <X,Y> void getSum(X x , Y y){
        System.out.println(x+" "  + y);
    }

}
public class Generics02 {
    static void main(String[] args) {
        Demo<String , Integer> demo = new Demo<>("Krishna Garg" , 24);
        System.out.println(demo.getFirst());
        System.out.println(demo.getSecond());

        System.out.println(demo.getArgument(12.09f));
        demo.getSum(10,"Krishna garg");
    }
}
