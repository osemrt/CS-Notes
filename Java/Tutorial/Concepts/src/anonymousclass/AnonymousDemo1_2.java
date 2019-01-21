package anonymousclass;

interface AB{
	public abstract void show();
}

public class AnonymousDemo1_2 {
	public static void main(String args[]) {
		// A obj = A(); is not allowed but ...
		
		AB obj = new AB(){
					public void show() {
						System.out.println("Abc");
					}
			
					};
					
		obj.show();
					
					
	}

}
