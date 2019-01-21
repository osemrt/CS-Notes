package interfaces.intefacetypes;

/*
 * Types of Interfaces
 * 1. Normal...................: This interface include more than one abstract public method.
 * 2. Single abstract method...: This interface include only one abstract public method. (Functional Interface)
 * 	  							 Lambda Expression comes from Scala that is the language of adopting of JAVA.
 * 								 and Java 8 has all features of Scala Language.
 * 3. Marker...................: This interface does not have any method.
 * 
 */

@FunctionalInterface // you should write it because if you make a mistake, the compiler warns you.
interface A{
	void show();	
}

public class Types {
	
	public static void main(String[] args) {
		// Lambda expression provides us to write the definition of the method in the interface in one line.
		A obj = () -> { System.out.print("Hi "); System.out.println("All!");};
		
		obj.show();
		
	}
	

}
