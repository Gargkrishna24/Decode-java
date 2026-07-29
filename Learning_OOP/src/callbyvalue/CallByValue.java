package callbyvalue;

public class CallByValue {

    static void addTen(int x , int y ){
        x +=10;
        y+=10;
    }
    static void main(String[] args) {
        int x  = 1 ;
        int y = 2;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        addTen(x,y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}


