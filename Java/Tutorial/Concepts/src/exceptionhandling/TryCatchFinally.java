package exceptionhandling;

/*
 * There are two types of error in JAVA. (ERROR and EXCEPTION)
 * EXCEPTION
 * -> Opening File (when you want to open a file but it is not exist there.)
 * -> User Input (You ask input from user, but user do not give it.)
 * -> You try to run a process but CPU is not available to do that.
 * -> Divide by 0, or other exceptions.
 * 
 * 			Throwable(Main Class)
 * 			|					|
 * 			|					|
 * 			|					|
 * 		Exception              Error
 * 	(can be handled)    (can not be handled)
 *     |    	|
 * 	   |        |
 * 	checked	 unchecked 
 * 
 * -----------------------------------------------------
 * 
 * 			┌-----Statements----┐
 * 			|					|
 * 			|					|
 * 			|					|
 * 		 Normal             Critical
 * 	   (int i = 1)		 (int k = i/j)
 * 
 * 
 * You do not need to make anything by writing normal statements, 
 * but you should write critical statements inside a block to catch any exception. 
 * 
 * You realize the exceptions in runtime, not compile time.
 * Generally, compile time catches syntax error such as curly bracket, parentheses or something like that, whereas
 * in runtime you can see logical errors and exceptions.
 * 
 * 
 * There are two ways to handle exceptions, one is 'throw them', another is 'catch them'.
 * 
 * 
 */

public class TryCatchFinally {
	public static void main(String args[]) {
		
		int k, i=20, j=0;
		
		try{
			k = i/j; // a critical statement
			
		}catch(Exception e) { // when a exception occurs, the code jump to here.
	   //catch(ArithmeticException e){ Also you can write specific exception.
			System.out.println("Error!");
			System.err.println("Error!"); // it writes text with red color.
		}finally { // it reduces the code.This block will be executed in both situations.
			System.out.println("The end of this file.");
		}
		
	}

}








