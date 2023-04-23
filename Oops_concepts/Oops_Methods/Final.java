package Oops_concepts;
final class a{
	final public void show() {
		System.out.println("This is final method can't be override..");
	}
	final public int config(int num) {
		return 1;
	}
}
/*class b extends a{
	// final classes can't be inherited...
}*/
public class Final{
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 10;
		 i = 15;
		 System.out.println(i);
		 final int I = 15;
		// I = 20;  cant be change..
		 
		 System.out.println(I);
		

	}

}
