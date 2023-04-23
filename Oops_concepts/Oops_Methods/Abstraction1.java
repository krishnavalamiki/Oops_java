package Oops_concepts;
class mobile{
	double price ;
	String MobileName;
	String brand;
	String camera;
	String ram;
	String batteryCapacity;
//	public mobile(double price, String mobileName, String brand, String camera, String ram, String batteryCapacity) {
//		super();
//		this.price = price;
//		MobileName = mobileName;
//		this.brand = brand;
//		this.camera = camera;
//		this.ram = ram;
//		this.batteryCapacity = batteryCapacity;
//	}
//	

}
public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         mobile obj = new mobile();
         obj.batteryCapacity="4000v";
         obj.camera="44mp";
         obj.brand="realme";
         obj.price=20000.00;
         System.out.println(obj.price);
	
	}

}

