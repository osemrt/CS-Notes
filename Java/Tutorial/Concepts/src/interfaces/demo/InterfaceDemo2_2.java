// We cannot create the object of Interface, We can only create a reference to it.
// And we can now create multiple inheritances.
// Each method in Interface must be public abstract, if you do not write them, the compiler write these two keywords.

/* A use of interface is that if you are a new programmer and someone says that can you write this application functions? or something,
*  then you start writing the the functions, You do not need to know what are actually these application do inside the big program.
*  For example, if you want to write a Facebook application, Facebook gives you API(Application Program Interface) and they want to complete
*  this interface to launct your application from you.*/

package interfaces.demo;

interface Writer{
	public abstract void write();
}


class Pen implements Writer{
	public void write(){
		System.out.println("I am a pen...");
	}
}

class Pencil implements Writer{
	public void write() {
		System.out.println("I am a pencil...");
	}
}

class InterfaceDemo2_2{
	public static void main(String args[]) {
		
	}
}