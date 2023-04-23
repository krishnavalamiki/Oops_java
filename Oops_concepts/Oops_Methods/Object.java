package Oops_concepts;


// object is a instance of class..
// inside the object having a methods and variables..

public class Object {
	class mango{
		String Name ;
		String tast ;      // object creation..
		String color ;
		int seeds;
		String shape  ;
		public String getName() {
			return Name;                       // methods getmethod and setmethods..
		}
		public void setName(String name) {
			Name = name;
		}
		public String getTast() {
			return tast;
		}
		public void setTast(String tast) {
			this.tast = tast;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getSeeds() {
			return seeds;
		}
		public void setSeeds(int seeds) {
			this.seeds = seeds;
		}
		public String getShape() {
			return shape;
		}
		public void setShape(String shape) {
			this.shape = shape;
		}
		public void show() {
			System.out.println(Name+"\n"+shape+"\n"+color+'\n'+tast+"/n"+seeds);
		}
	}
	

	public static void main(String[] args) {
		Object ob = new Object();
		Object.mango m = ob.new mango();
	    m.color ="yellow";
	    m.Name = "Mango";
	    m.seeds = 1;
	    m.shape = "round";
	    m.show();

	}

}
