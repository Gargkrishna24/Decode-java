package nestedClasses.localclasses;

public class Validator {
    // An instance variable of the outer class
    private String countryCode = "+91";

    public void formatNumber(String rawNumber) {
        // A local variable inside the method
        // This is "effectively final" because we never change its value below.
        int requiredLength = 10;

        // ---------------------------------------------------------
        // LOCAL CLASS DECLARATION
        // This class is completely trapped inside the formatNumber method.
        // ---------------------------------------------------------
        class PhoneNumber {
            String formatted;

            public PhoneNumber() {
                // The local class can access the method's local variables (requiredLength)
                // and the method's parameters (rawNumber).
                if (rawNumber.length() == requiredLength) {
                    // It can also access the outer class's private instance variables (countryCode).
                    this.formatted = countryCode + "-" + rawNumber;
                } else {
                    this.formatted = "Invalid Number Length";
                }
            }

            public void printResult() {
                System.out.println("Result: " + this.formatted);
            }
        } // End of Local Class

        // ---------------------------------------------------------
        // USING THE LOCAL CLASS
        // We must instantiate and use it right here inside the method.
        // ---------------------------------------------------------
        PhoneNumber myNumber = new PhoneNumber();
        myNumber.printResult();
    }

    public static void main(String[] args) {
        Validator validator = new Validator();

        // When we call this method, the local class is temporarily born,
        // does its job, and is then discarded.
        validator.formatNumber("9876543210");
        validator.formatNumber("12345");
    }
}
