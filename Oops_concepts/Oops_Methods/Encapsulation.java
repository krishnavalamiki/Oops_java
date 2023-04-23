package Oops_concepts;
class MarksInfo{
	String name;
	double marks;
	String Phno;
	String IDno;
	boolean ispresent;
	public MarksInfo(String name, double marks, String phno, String iDno, boolean ispresent) {
		super();
		this.name = name;
		this.marks = marks;
		Phno = phno;
		IDno = iDno;
		this.ispresent = ispresent;
	}
	public void show() {
		System.out.println(name+"\n"+marks+"\n"+Phno+"\n"+IDno+"\n"+true);
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		MarksInfo sd  = new MarksInfo("Krishna", 600, "6300838419", "184T1R0033", true);
        System.out.println(sd);
        sd.show();
	}

}
