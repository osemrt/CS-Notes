package anonymousclass;

class A{
	
	int i = 10;
	void write(){
		System.out.println("Good");
	}
}


class AnonymousDemo1_1{
	public static void main(String args[]) {
		A obj = new A() {
				 		  void write() {
				 			  int i = 20;
				 			  System.out.println("Bad");
				 		  }
						};
						
       obj.write();	
       System.out.println(obj.i);
		
	}
}