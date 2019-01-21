package multithreading;

/*
 * You can fix the problem in Thread5_0 by putting synchronized keyword 
 * into the declaration of the function.
 * 
 */

class Counter2 {
	int count;
	public synchronized void increment() {
		count++;
	}
}

public class Thread5_1 {
	public static void main(String[] args) throws Exception {
		
		Counter2 obj = new Counter2();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10000; i++) {
					obj.increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run(){
				for(int i=0; i<10000; i++) {
					obj.increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(obj.count);		

	}

}
