package p1;

public class B implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i<100;i++) {
			System.out.println(" thr Radha");
		}
	}
	public static void main(String[] args) {
		
		
		
		B b1 = new B ();
		for(int i = 0; i<100;i++) {
			System.out.println(" thr Radha");
		}
	
		Thread th = new Thread (b1);
		th.start();
		
		
	}

}
