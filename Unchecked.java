package Exception_Handlings;

public class Unchecked {

	public static void main(String[] args) {
		
		String s = "Sivamma";
		//System.out.println(s.charAt(7)); // It throws StringIndexOutOfBoundsException
        try {
        	System.out.println(s.charAt(7));
        }catch(StringIndexOutOfBoundsException SI) {
        	SI.fillInStackTrace();
        }finally {
        	System.out.println("Unchecked_Exception");
        }
	}

}
