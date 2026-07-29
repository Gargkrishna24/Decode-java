package Basics;

public class Student {
	String name ;
	int rollNumber;
	String city;
	
	Student(String name , int rollNumber , String city) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.city = city;
	}
	
	void useLibrary() {
		System.out.println("He can use library of the university");
	}
	
	public static void main(String[] args) {
		Student student = new Student("Krishna Garg",221500093,"Agra");
		System.out.println(student);
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", city=" + city + "]";
	}
}

