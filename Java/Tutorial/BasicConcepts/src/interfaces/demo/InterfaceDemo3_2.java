package interfaces.demo;

/*
 * to solve this problem you can follow these two ways.
 * 1 - by overriding these functions.
 * 
 * 
 * 
 */

interface A{

	default void display() { // also you can override this function.
		System.out.println("in A.");
	}
	
}

interface B{

	default void display() { // also you can override this function.
		System.out.println("in B.");
	}
	
}

class C implements A, B{
	/*
	 * @Override
	 *  public void display() {
	 *	System.out.println("in C......");
	 * }
	 * 
	 */
	
	public void display() {
		A.super.display();
		B.super.display();
	}
	
	
	void show() {
		System.out.println("in C.");
	}
}

public class InterfaceDemo3_2 {
	
	

}
