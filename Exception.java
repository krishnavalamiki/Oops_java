package Exception_Handlings;

public class Exception {

	public static void main(String[] args) {
		
		try {
			int [] a = {1,2,3,4,5};
			System.out.println(a[5]);
		}catch(ArrayIndexOutOfBoundsException AIb) {
			System.out.println("ArrayIndexOutOfException");
			AIb.printStackTrace();
		}finally {
			System.out.println("ExceptionHandlings");
		}
		
	}

}
