package abstractclass;


// if A class is an abstract, at least one abstract methods have to be in this class. 
// you do not use both of abstract and private with together in a declaration.
// you can not create the object of an abstract class.
abstract class Human{ // Abstract Class
	
	int i;
	
	abstract void eat();

	
	void walk() {
		System.out.println("I am able to walk...");
		
	}
	
}


class Man extends Human{ // Concrete Class
	
	void eat() {
		System.out.println("I am able to eat sth...");		
	}
}


public class AbstracDemo {
	
	public static void main(String[] args) {
		Man obj1 = new Man();
		obj1.eat();
		obj1.walk();
		
		
		Human obj2 = new Man();
		obj2.eat();
		obj2.walk();
		
	}
	
	

}
