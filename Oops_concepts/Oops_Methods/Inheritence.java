package Oops_concepts;
class fruits{
	public void root() {
		System.out.println("Every friuts roots having mostly lataral roots");
	}
	public String getFruitName() {
		//String fruitName="";
		return "";
	}
	public String GetColorOfFruit() {
		//String Color="";
		return "";
	}
	public String getTast() {
		return "";
	} 
}
class bananna extends fruits{
	public void root() {
		System.out.println("Every friuts roots having mostly lataral roots");
	}

	@Override
	public String getFruitName() {
	    String fruitName = "Bananna";
		return fruitName;
	}

	@Override
	public String GetColorOfFruit() {
	    String color="yellow";
		return color ;
	}

	@Override
	public String getTast() {
		String tast="sugar";
		return tast ;
	}

}
class graphee extends fruits{

	@Override
	public void root() {
		System.out.println("Fruits mostly lataral roots..");
	}

	@Override
	public String getFruitName() {
		String fruitName="Graphee";
		return fruitName;
	}

	@Override
	public String GetColorOfFruit() {
		String color="Black";
		return color ;
	}

	@Override
	public String getTast() {
		String tast="Delicious";
		return tast;
	}
}

public class Inheritence {

	public static void main(String[] args) {
	bananna ba = new bananna();
	System.out.println(ba.GetColorOfFruit());
	System.out.println(ba.getFruitName());
	System.out.println(ba.getTast());
	ba.root();
	

	}

}
