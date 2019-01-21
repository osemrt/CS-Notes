package interfaces.demo;

/*
 * 		Many features came with Java8, the Java developers have needed to put function 
 * declaration in Interfaces, for example, Stream API that is a new concept was 
 * introduced in Java8, and this API affects many function and interfaces if you 
 * look the List interface, you will see many things about Stream API, if these 
 * developers will add directly Stream declarations inside of the interfaces, many
 * problems will occur, for instance, what will happen the programs that are written 
 * in  Java7 or before? How will these programs be implemented to Java8? etc. So, 
 * to solve this problem, They allow writing function definitions inside of interfaces 
 * but some problems still occur sth like "multiple inheritances",
 * 
 * to prevent overriding any Object function, we need to add default keyword!!!
 * 
 * 
 * in Overriding always Class has more priority than Interfaces.
 * 
 * 
 * 
 * 
 */

interface I{
	
	public abstract void show();
	default void display() {
		System.out.println("in I...");
	}
	
	default boolean equals(Object obj) {
        return (true);
    }
	
}

interface J{
	
	public abstract void show();
	default void display() {
		System.out.println("in I...");
	}
	
	static void func() {
		System.out.println("in func...");
	}
	 
}

// The solution of multiple inheritance, you have to override the common function.
class PhoneClass implements I, J{
	
	public void show() {
		System.out.println("in Show");
	}

	@Override
	public void display() {
		System.out.println("in Class Display Function...");
	}
	
	
	
}

class K extends PhoneClass implements I,J{
	
	
	
}

class NewFeaturesClass {
	

	public static void main(String[] args) {
		PhoneClass ph = new PhoneClass();
		ph.display();
		
		K obj = new K();
		obj.display();

		Object as;
		
	}
	
	

}

















