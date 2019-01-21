package testpackage;

class A{	
	
	void show() {
		System.out.println("in A");
	}	
}

class B extends A{
	
	
	void show() {
		System.out.println("in B");
	}	
	
}


class C extends B{
	@Override
	void show() {
		super.show();
		System.out.println("in C");
		}	
	
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		C obj = new C();
		obj.show();
		
	}

}
