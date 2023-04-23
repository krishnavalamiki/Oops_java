package Oops_concepts;

// parametar and parametarized constructor...

class Student{
	String Name;
	String IdNo;
	String Address;
	double Salary;
	int PhNo;
	public Student() {
	   // deafult constructor
		System.out.println("This is the deafult constructor..");
	}
	public Student(String name) {
		super();
		Name = name;
		System.out.println("parametarized constructor"+name);
	}
	public Student(String name, String idNo) {
		super();
		Name = name;
		IdNo = idNo;
		System.out.println("Name of a student :"+name+"\n"+"Student IDNO :"+idNo);
	}
	
	
}

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
