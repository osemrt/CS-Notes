package interfaces.demo;

/*
 * You can not define a method inside of a interface, but in Java 1.8 and later you can do it by writing default before the declaration of a function.
 * We will see the purpose of it in Collections concept.
 * 
 */

// it works because we said that we declare only one public abstract method.
//There are two methods in interface A, one is abstract and another one is default.
@FunctionalInterface 
interface A{
	
	void show();
	default void display() { // also you can override this function.
		System.out.println("in A.");
	}
	
}

public class InterfaceDemo3_0 {
	
	

}
