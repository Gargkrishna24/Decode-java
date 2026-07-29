package Enum;

// Enum = enumeration
// enum = predefined set of constraint;
//An enum is just a special kind of class that implicitly extends java.lang.Enum. Each constant (like SUCCESS) is actually a public static final instance of that class. Java automatically generates useful methods for you (like values(), ordinal(), name()) by inheriting from java.lang.Enum."// each const are by default static and final and are actually objects of enum class say Direction
public class Basics {
    enum PaymentStatus {
        SUCCESS,
        FAILED,
        PENDING;
    }

    class PaymentStatus2 {
        public static final int SUCCESS = 1;
        public static final int FAILED = 2;
        public static final int PENDING = 3;
    }

    class Role{
        public static final int CUSTOMER = 1;
        public static final int ADMIN = 1;
        public static final int MANAGER = 1;
    }

    static void main(String[] args) {
        int status = PaymentStatus2.SUCCESS;
        System.out.println("status = " + status);
        status = 3;
        System.out.println(status);// Type safety

        if(status == Role.ADMIN){
            System.out.println("NO GROUPING OF RELATED ENTITIES");
        }

        // POOR READABILTIY - BECAUSE I HAVE TO ALWAYS CHECK THE CONSTANT VALUE IN THEIR RESPECTED CLASSES BEFORE initialized VALUES TO SOME VARIABLES;


        // DUE To above some reasons we uses enums;

//        PaymentStatus check = 100; // Type safety
        PaymentStatus checkStatus = PaymentStatus.FAILED;
        System.out.println(checkStatus);
        if(checkStatus==PaymentStatus.SUCCESS){
            System.out.println("TRUE");
        }
    }
}
