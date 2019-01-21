package exceptionhandling;

class MyException extends Exception{
	
}


public class Throws2 {
	
	public static void main(String[] args) throws MyException {
		
		int i = 2/0;
	}

}
