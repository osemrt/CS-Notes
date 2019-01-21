package multithreading;

class A3 implements Runnable{
	public void run() {
		for( int i=0; i<5; i++) {
			System.out.println("in A");
			try{ Thread.sleep(500); }catch(Exception e) {};
		}
	}
	
}

class B3 implements Runnable{
	public void run() {
		for( int i=0; i<5; i++) {
			System.out.println("in B");
			try{ Thread.sleep(500); }catch(Exception e) {};
		}
	}
	
}

public class Thread1_2 {
	public static void main(String[] args) {
		A3 obj1 = new A3();
		B3 obj2 = new B3();
			
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
	}

}
