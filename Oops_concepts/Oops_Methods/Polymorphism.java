package Oops_concepts;
class calculator{
	public int add(int a,int b) {
		return a+b;                  // compiletime polymorphism..
	}
	public int multiply(int a, int b) {   // method overloading..
	     return a*b;
	}
	public int division(int a ,int b) {
		return a/b;
	}
	public int modulous(int a , int b) {
		return a%b;
	}
}
class advanceclaculator extends calculator{


	public int add(int c, int d) {

		return c+d;
	}

	public int multiply(int c, int d,int e) {
		return c*d*e;
	}

	public int division(int c, int d) {
		return c/d;
	}

	
	public int modulous(int a, int b) {
		
		return a%b;
	}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		calculator ca = new calculator();
	     System.out.println(ca.add(10, 10));
	     System.out.println(ca.division(200, 20));
	     System.out.println(ca.multiply(5, 5));
	     System.out.println(ca.modulous(100,3));
	     System.out.println("Advancecalculator... ");
	     advanceclaculator ac = new advanceclaculator();
	     System.out.println(ac.add(1000, 1000));
	     System.out.println(ac.division(1000000, 10));
	     System.out.println(ac.multiply(10, 10, 10));  // polymorphism means onething perform many ways..
	     System.out.println(ac.modulous(10000000, 10));

	}

}
