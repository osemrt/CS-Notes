package multithreading;

class A6 extends Thread{
	public void run() {
		for(int i=0; i<6; i++) {
			System.out.println("in A");
			try{ Thread.sleep(500); } catch(Exception e) {};
		}
	}
}

class B6 extends Thread{
	public void run() {
		for(int i=0; i<6; i++) {
			System.out.println("in B");
			try{ Thread.sleep(500); } catch(Exception e) {};
		}
	}
}

/*
 * The rage priority is from 1 to 10, 1 means less priority.
 * We can not remember which is less priority, in this case, we can use constant!
 * 
 */

public class Thread4_0 {
	public static void main(String args[]) throws Exception {
		A5 obj1 = new A5();
		B5 obj2 = new B5();
		
		obj1.start();		
		obj2.start();
		
		obj1.setPriority(obj1.MIN_PRIORITY);
		obj2.setPriority(10);
		
		
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		
		obj1.join();
		obj2.join();
		
		System.out.println(Thread.currentThread().getPriority());
		
	}
}