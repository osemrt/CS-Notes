// What is Number Class? Is it a wrapper class or not ?
					
package abstractclass;


class Printer{
	
	void show(Integer i) {
		System.out.println(i);
	}
	
	void show(Double i) {
		System.out.println(i);
	}
	
}


class AdvancedPrinter{
	
	void show(Number i) {
		System.out.println(i);
	}
	
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		
		Printer obj1 = new Printer();
		AdvancedPrinter obj2 = new AdvancedPrinter();
		
		obj2.show(4.3);
		
		
	}
	
}
