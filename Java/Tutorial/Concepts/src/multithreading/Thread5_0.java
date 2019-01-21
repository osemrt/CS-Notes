package multithreading;

class Counter {
	int count;
	public void increment() {
		count++;
	}
}

public class Thread5_0 {
	public static void main(String[] args) throws Exception {
		
		Counter obj = new Counter();
		
		// let's create a run_obj.
		Runnable run_obj1 = new Runnable(){
			@Override
			public void run(){
				for(int i=0; i<10000; i++) {
					obj.increment();
				}
			}
		};
		
		//let's create second run_obj.
		Runnable run_obj2 = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10000; i++) {
					obj.increment();
				}
			}
		};
		
		Thread t1 = new Thread(run_obj1);
		Thread t2 = new Thread(run_obj2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(obj.count);		

	}

}
