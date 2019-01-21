package interfaces.demo;

class Writer{
	void write(){
		
	}
}

class Pen extends Writer{
	void write(){
		System.out.println("I am a pen...");
	}
}

class Pencil extends Writer{
	void write() {
		System.out.println("I am a pencil...");
	}
}

class Kit{
	void doSomething(Writer tool) {
		tool.write();
	}
}


class InterfaceDemo2_1{
	
	public static void main(String[] args) {
		Kit k = new Kit();
		
		Writer obj1 = new Pen();
		Writer obj2 = new Pencil();
		
		obj1.write();
		obj2.write();
		
		k.doSomething(obj1);
		k.doSomething(obj2);
		
	}
	
	
}