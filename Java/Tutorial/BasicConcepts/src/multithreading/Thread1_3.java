package multithreading;


public class Thread1_3 {
	public static void main(String[] args) {
		// with anonymous class.
		Runnable obj1 = new Runnable(){
								public void run() {
									for( int i=0; i<5; i++) {
										System.out.println("in A");
										try{ Thread.sleep(500); }catch(Exception e) {};
										}
									}
			
									};
									
		// with lambda expression.							
		Runnable obj2 = () -> {
									for( int i=0; i<5; i++) {
											System.out.println("in B");
											try{ Thread.sleep(500); }catch(Exception e) {};
										}
									
			
								};
								
							
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
								
		t1.start();
		t2.start();						
								
								
		
	}

}
