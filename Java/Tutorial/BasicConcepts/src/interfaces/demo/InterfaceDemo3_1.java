package interfaces.demo;

/*
 * There is a uncertain issue in multiple implements.
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
	void show() {
		System.out.println("in C.");
	}
}

public class InterfaceDemo3_1 {
	
	

}
