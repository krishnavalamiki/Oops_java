package Oops_concepts;
// Two ways hide the details by using interfaces and abstract class..
interface laptop{
	public void isCopy();
	public void isPaste();
	public String isCapacity();
	public void isCut();
    default double iscamerQuality() {
		return 0;
    }
}
class dell implements laptop{

	@Override
	public void isCopy() {
		System.out.println("copy code is here...");
		
	}

	@Override
	public void isPaste() {
	    System.out.println("paste code here..");
		
	}

	@Override
	public String isCapacity() {
		System.out.println("capacity of laptop");
	    return "1Tb";
	}

	@Override
	public void isCut() {
		System.out.println("cut code here..");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
	 // Abstraction means hidding the details showing the functionallity..
		dell dl = new dell();
		dl.isCut();
		dl.isCopy();
		dl.iscamerQuality();
	}

}
