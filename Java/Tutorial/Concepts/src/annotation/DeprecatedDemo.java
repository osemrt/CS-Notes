package annotation;

class D{
	
	@Deprecated
	void show1() {
		System.out.println("abc");
	}
	
	void show2() {
		System.out.println("123");
	}
	
}

public class DeprecatedDemo {
	public static void main(String[] args) {
		
		D obj = new D();
		obj.show1();
		obj.show2();
		
	}

}
