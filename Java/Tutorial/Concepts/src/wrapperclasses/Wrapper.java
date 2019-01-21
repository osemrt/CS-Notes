package wrapperclasses;

public class Wrapper {
	
	//primitive types work faster than class types.
	
	int i = 5; // primitive datatype
	Integer ii = new Integer(5); // Wrapper class
	
	// Boxing or Wrapping concept is that you put a primitive variable to inside of a Class.
	int k = 10;
	Integer kk = new Integer(k); // boxing - wrapping
	Integer qq = k; // Auto boxing or wrapping, Java converts it to the above syntax. you can use this syntax.
	
	int j = kk.intValue(); // unboxing - unwrapping
	
	int p = kk; // autounboxing - autounwrapping
	
	
	
}
