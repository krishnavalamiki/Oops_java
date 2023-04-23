package Threads;
class a implements Runnable{

	@Override
	public void run() {
	     for(int i = 1; i<=1000; i++) {
	    	 System.out.println("Hiii..");
	     }
		
	}
	
}
class b  implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i<=1000; i++) {
			System.out.println("Hello..");
		}
		
	}
}

public class Threads_1 {

	public static void main(String[] args) {
	Runnable r = new a();
	Runnable r1 = new b();
	Thread t = new Thread(r);
	Thread t1 = new Thread(r1);
	t.start();
	t1.start();

	}

}
