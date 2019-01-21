package classclass;


public class ForNameDemo {
	
	public static void main(String[] args) throws Exception {
		
		//We can call static block in Pqr without creating a Class Object.
		Class.forName("classclass.Pqr");
		
		//We called a instance object without creating a Class Object.
		Class.forName("classclass.Pqr").newInstance();	
		
	}

}


class Pqr{
	
	//static block
	static {
		System.out.println("in Static");		
	}
	
	static void show(){
		System.out.println("in Show");
	}
	
	public void display(){
		System.out.println("in Display");
	}
	
	//instance block
	{
		System.out.println("in Block");		
	}	
	
}