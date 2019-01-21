package multithreading;

/*
 * 					main
 * 			t1		 |		 t2
 * 			┌-----------------┐
 * 			|				  |	
 * 		    |				  |
 * 			|				  |
 * 			|		join	  |
 * 			└-----------------┘
 * 	      t1.join(); | t2.join();
 * 					 |
 * 
 * 
 * 
 * 
 */

class A4 extends Thread{
	public void run() {
		for(int i=0; i<6; i++) {
			System.out.println("in A");
			try{ Thread.sleep(500); } catch(Exception e) {};
		}
	}
}

class B4 extends Thread{
	public void run() {
		for(int i=0; i<6; i++) {
			System.out.println("in B");
			try{ Thread.sleep(500); } catch(Exception e) {};
		}
	}
}

public class Thread2_0 {
	public static void main(String args[]) throws Exception {
		A4 obj1 = new A4();
		B4 obj2 = new B4();
		
		obj1.start();		
		obj2.start();
		
		System.out.println(obj1.isAlive());
		System.out.println(obj2.isAlive());
		
		obj1.join();
		obj2.join();
		
		System.out.println(obj1.isAlive());
		System.out.println(obj2.isAlive());
		
		System.out.println("End!");
		
	}

}
