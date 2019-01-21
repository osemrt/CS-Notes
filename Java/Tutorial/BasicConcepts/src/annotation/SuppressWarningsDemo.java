package annotation;

/*
 * When you use this annotation, compilers do not warn you about unused items.
 * 
 * https://stackoverflow.com/questions/1205995/what-is-the-list-of-valid-suppresswarnings-warning-names-in-java
 * 
 */

class C{
	void show() {
		System.out.println("in A");
	}
}

public class SuppressWarningsDemo {
	public static void main(String[] args) {
		
		//@SuppressWarnings ("unchecked")
		@SuppressWarnings(value = { "unchecked", "all" })		
		C obj1 = new C();
		
	}

}
