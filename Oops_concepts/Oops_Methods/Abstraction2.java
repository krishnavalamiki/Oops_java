package Oops_concepts;
abstract class Manger{
	abstract public void salary();     // abstract class creating we using abstract keyword..
	public double Startduty() {
		return 08.30;                  // abstract methods also create abstract keyword..
		
	}
}
class Employe extends Manger{

	public void salary() {
		System.out.println("Employe Salary is 40000 per month..");
		
	}
	
}
public class Abstraction2 {

	public static void main(String[] args) {
		Employe e = new Employe();
		e.salary();
        
	}

}
