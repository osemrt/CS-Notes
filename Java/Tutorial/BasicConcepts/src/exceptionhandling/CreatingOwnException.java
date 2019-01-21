package exceptionhandling;

/*
 * class MyException extends Runtim{
 * 		//Unchecked
 * }
 * 
 */

class MyException extends Exception{
	  //Checked
	public void MyException() {
		System.out.println("Error!");
	}

}

public class CreatingOwnException {
	
	public static void main(String args[]) throws exceptionhandling.MyException {
		
			MyException obj = MyException(); 
		
			int k = 10;
			if( k>5 ) {
				throw obj;
			}
		
		
	}

}
