package annotation;

class A{
	void show() {
		System.out.println("in A");
	}
}

class B extends A{
	@Override
	void show() {
		System.out.println("in B");
	}
}

public class OverrideDemo {
	public static void main(String[] args) {
		
		B obj1 = new B();
		obj1.show();
		
	}

}
