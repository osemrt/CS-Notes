package exceptionhandling;

public class Throws {
	public static void main(String[] args) throws Exception{
		// If you want to write all exceptions might be occur, 
		// you can send of them to default Exception by writing throws keyword at the end of the function.
		
		try {
			int arr[] = new int[4];
			arr[6] = 10;
			
			int i = 2/0;
			
	
		}catch(ArithmeticException e) {
			System.out.println("You can not divide any integer number to zero... " + e);
		}finally {
			System.out.println("Ends here...");
		}
		
		
	}
}
