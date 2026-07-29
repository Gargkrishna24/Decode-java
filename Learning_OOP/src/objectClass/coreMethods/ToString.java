package objectClass.coreMethods;

//Provides a String Representation: Returns a human-readable text version of an object's current state and data.
//
//Universal Availability: Exists on every single Java object because it is automatically inherited from the root Object class.
//
//Implicit Print Execution: Triggers automatically behind the scenes when you pass an object directly into System.out.println().
//
//Implicit Concatenation Execution: Triggers automatically when you use the + operator to combine an object with a String (e.g., "Result: " + myObject).
//
//Default Fallback: Outputs the class name, an @ symbol, and the object's memory address in hexadecimal (e.g., Student@1b6d3586) if you do not provide your own implementation.
//
//Custom Data Formatting: Allows you to dictate exactly how the object should be read by overriding the method (e.g., structuring the output as JSON or comma-separated values).
//
//Simplifies Debugging: Makes log files and console output instantly readable by displaying actual variable values instead of cryptic memory locations.
public class ToString {
    static void main(String[] args) {
         Student s = new Student();
         s.name = "Krishna garg";
         s.rollNumber= 221500;
        System.out.println(s.toString());
    }
}

class Student{
    String name;
    int rollNumber;

    @Override
    public String toString(){
        return (this.name + " , " + this.rollNumber);
    }
}
