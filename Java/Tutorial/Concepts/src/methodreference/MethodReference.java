package methodreference;

class A{
	void show() {
		System.out.println("No argument!");
	}
	
	void show(int num) {
		System.out.println(num);
	}
	
}

public class MethodReference {
	public static void main(String[] args) {
		
		A obj = new A();
		obj::show;
		
	}
}
