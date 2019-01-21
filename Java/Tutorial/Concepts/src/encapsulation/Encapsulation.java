package encapsulation;

class A{
	
	private int rollno;
	String s;
	
	static int var;
	
	
	void setRollno(int rollno){
		this.rollno = rollno; 
	}
	
	int getRollno() {
		return rollno;
	}
	
	
}

class B{
	
	void func() {
		A.var = 20;
		
	}	
	
	
}




public class Encapsulation {
	
	public static void main(String[] args) {
				
		
	}

}
