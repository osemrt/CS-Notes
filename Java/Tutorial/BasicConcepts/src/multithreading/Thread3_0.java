package multithreading;

class A5 extends Thread{
	public void run() {
		for(int i=0; i<6; i++) {
			System.out.println("in A");
			try{ Thread.sleep(500); } catch(Exception e) {};
		}
	}
}

class B5 extends Thread{
	public void run() {
		for(int i=0; i<6; i++) {
			System.out.println("in B");
			try{ Thread.sleep(500); } catch(Exception e) {};
		}
	}
}

public class Thread3_0 {
	public static void main(String args[]) throws Exception {
		A5 obj1 = new A5();
		B5 obj2 = new B5();
		
		obj1.start();		
		obj2.start();
		
		obj1.setName("Thread-A");
		obj2.setName("Thread-B");
		
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
		
	}

}
