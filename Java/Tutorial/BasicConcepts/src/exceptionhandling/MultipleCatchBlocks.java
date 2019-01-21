package exceptionhandling;

public class MultipleCatchBlocks {
	
	public static void main(String[] args) {
		
		try {
			int arr2[] = null;
			arr2[2] = 5;
			
			int arr[] = new int[6];
			arr[6] = 8;
			
			int i=20, j=0, k;
			k = i/j;
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception!");
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds Exception! " + e);
			
		}catch(Exception e) {
			System.out.println("There is an unknown error!");
		}
		
		/*in Java 1.7 or later versions, you can handle one or more exceptions in one line.
		 * catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
		 * 	  System.out.println("Error!);	
		 * }
		 */
		
		finally {
		
			System.out.println("End!");
		}
		
	}
	
	

}
