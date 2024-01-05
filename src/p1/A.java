package p1;
public class A extends Thread {
	public void run() { // this is the thread 2 in the java 
		for ( int i = 0 ; i<1000;i++) {
			System.out.println("KING");
		}
		
		
	 

	}
	public static void main(String[] args) {// this is the thread 1
		for ( int i = 0 ; i<1000;i++) {
			System.out.println("MAIN");
		}
		A a1 = new A ();
		a1.start();
	}
	
		
	}
