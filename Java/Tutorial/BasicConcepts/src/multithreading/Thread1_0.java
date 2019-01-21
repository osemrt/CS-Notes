package multithreading;

class A{
	void show() {
		for(int i = 0; i<10; i++) {
			System.out.println("in A");
			//let's wait our main thread.
			try{ Thread.sleep(500); }catch(Exception e){};
		}
	}
}

class B{
	void show() throws Exception {
		for(int i = 0; i<10; i++) {
			System.out.println("in B");
			Thread.sleep(500);
		}		
	}
}


public class Thread1_0 {
	public static void main(String[] args) throws Exception {
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.show();
		obj2.show();
	}

}
