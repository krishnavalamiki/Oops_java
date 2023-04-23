package Oops_concepts;

public class Classes {
	
	// class is blueprint,template of object..
	// innerclass and ananomys innerclass..
	
	class  a extends Classes{
		public void show() {
			System.out.println("Class inside class is called innerclass..");
		}
		public void config() {
			System.out.println("passing the super class name and instance of super class for object creation..");
		}
	}

	public static void main(String[] args) {
	Classes ca = new Classes();
	Classes.a an = ca.new a(); // inner class instance creating..
       a obj1 = ca.new a() {
    	   public void show() {
    		   System.out.println("Ananomys innerclass");            // creating ananomys innerclass..
    	   }
       };
       obj1.show();
       an.show();
	}

}
