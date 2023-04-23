package Threads;
class a extends Thread{
	public void run() {
		for(int i = 1; i<=1000; i++) {           // 
			System.out.println("Hiii..");
			try {
				Thread.sleep(10);                // wating stage of the execution.. 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class b extends Thread{
	public void run() {
		for(int i = 1; i<=1000; i++) {
			System.out.println("Hello..");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Threads_ {

	public static void main(String[] args) {
		
       a A = new a();
       A.start();
       b B = new b();
       B.start();              //calling start method to execute the run() method of the Thread class
       
      
	}

}
