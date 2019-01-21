package finalkeyword;

class A{	
	final int VAR1 = 10; // final make variables constant. 
	final int VAR2;
	A(){
		// VAR1 = 20;
		VAR2 = 30;
		// VAR2 = 40; // you cannot change a constant variable when it is initialized once.
	}
	
	void show(){
		System.out.println("Hi! I am in B...");
	}	
}

/*final class B{ // Use the final keyword with Class, When you do not want to extend the class. 
	void show() {
		System.out.println("Hi! I am in B...");
	}
}

class C extends B{
	
}*/

/*class D {	
	void final show(){ //  Use the final keyword When you want that anyone cannot override your function.
		System.out.println("in D..");
	}	
}

class E extends D{
	void show() {
		System.out.println("in E..");
	}	
}*/

public class FinalDemo {
	
	public static void main(String[] args) {
		//A obj1 = new A();
		//obj1.show();
		
		//C obj2 = new C();
		//obj2.show();
		
		//E obj3 = new E();
		//obj3.show();
		
		
		
	}

}
