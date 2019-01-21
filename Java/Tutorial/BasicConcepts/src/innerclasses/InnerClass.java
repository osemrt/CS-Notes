package innerclasses;

/*
 * There are 3 types inner cllases.
 * 1) Member
 * 2) Static
 * 3) Anonymous
 * 
 */


//Member Class eg.
class A{	
	int i;	
	class B{
		int j;
	}
}
//

//Static Class eg.
class C{
	static int i;
	static class D{
		int j;
	}
}
//



public class InnerClass {
	public static void main(String[] args) {
		
		//Member Class
		A obj1 = new A();
		obj1.i = 10;
		System.out.println(obj1.i);
				
		A.B obj2 = obj1.new B();
		
		obj2.j = 20;
		System.out.println(obj2.j);
		/////////////
		
		
		//Static Class
		C.i = 20;
		C.D obj3 = new C.D();
		obj3.j = 30;
		System.out.println(obj3.j);
		/////////////
		
		
		//Anonymous	
		//eg1----------------------------------------------------------------
		Phone ph1 = new Phone() { @Override 
								 public void show(){
									System.out.println("Sms");
								 }
							   };
		//--------------------------------------------------------------------
							   
		//eg2----------------------------------------------------------------
		Phoneable ph2 = new Phoneable() { @Override
										public void show() {
										  System.out.println("Calling");
									    }
									  };
		//--------------------------------------------------------------------					   
							   
		//eg3-----------------------------------------------------------------
		Phoneable ph3 = () -> { System.out.println("Hi!"); };
		//--------------------------------------------------------------------
				
		
	}

}

class Phone{
	public void show() {
		System.out.println("Phone!");
	}
}


interface Phoneable{
	abstract public void show();
}