package callbyvalue;

class Values{
    int x ;
    int y ;

    Values(int x , int y){
        this.x = x;
        this.y = y ;
    }
}

public class CallByReference {
    static void main(String[] args) {
        int x = 5;
        int y = 5;

        System.out.println("x,y = " +x+ " ,"+ y);
        Values values = new Values(x,y);

        addTen(values);

        System.out.println("After Passing the Object to the method");
        System.out.println("x,y = " + values.x + " ," + values.y);

    }

    static void addTen(Values value){
        value.x+=10;
        value.y+=10;
    }
}


