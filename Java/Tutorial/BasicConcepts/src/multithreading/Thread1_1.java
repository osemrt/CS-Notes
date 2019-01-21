package multithreading;

/*
 * 'start' function in thread class always call 'run' function. 
 * so, you have to put run the name of your function.
 *
 **/

class A2 extends Thread{
	
	public void run() {		
		for(int i=0; i<10; i++) {
			System.out.println("in A");
			try{ Thread.sleep(500); }catch(Exception e) {}
		}
	}	
}

class B2 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("in B");
			try{ Thread.sleep(500); }catch(Exception e) {}
		}
	}
}

public class Thread1_1 {
	public static void main(String[] args) {
		A2 obj1 = new A2();
		B2 obj2 = new B2();
		
		obj1.start();		
		obj2.start();
		
	}

}
