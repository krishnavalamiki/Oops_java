package Exception_Handlings;

public class Exception_A {
	
	// Exception is an unwanted and unexepted event is occurs during execution at a runtime.
     /*
      * There are two types exceptions 1)checked and unchecked exception..
      * checked ex:filenotException,Ios exception,class foundnot Exception etc..
      * unchecked ex:arithematic Exception,arrayIndexOfBond
      */
	public static void main(String[] args) {
		
		
		int i = 10;
		int j = 0;
		try {
		int result = i/j;
		System.out.println(result);
		}catch(ArithmeticException Ae) {
			System.out.println("The value 10 is not divided by 0..");
			Ae.fillInStackTrace();
		}finally {
			System.out.println("Exception_Handlings..");
		}
	}

}
