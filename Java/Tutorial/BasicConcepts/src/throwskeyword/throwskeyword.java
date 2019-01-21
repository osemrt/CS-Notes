package throwskeyword;

public class throwskeyword {
	
	public static void main(String[] args) throws Exception {
		
		
		try {
			int k = 10;
			if(k>5) {
				throw new ArithmeticException();
			}
			System.out.println("Bye");
			
		}catch(ArithmeticException e) {			
			System.out.println("The value of k must be less than 5! " + e);
		}
		
		
		
		
	}

}
