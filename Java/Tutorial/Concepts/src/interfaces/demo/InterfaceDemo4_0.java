package interfaces.demo;

/*
 * in new feature with Java 1.8, you can a static method in interface, and you can call it with the name of interface.
 * 
 * 
 */

interface A{
	int i = 20; // whenever you create a variable in interface, even you do not write final keyword, it will be constant by default.
	void abc();
	static void show() {
		System.out.println("Hi!");
	}
}

public class InterfaceDemo4_0 {
	
	public static void main(String[] args) {
		A.show();
		
	}

}
