package stream;

/*
 * Functional programming, streams and many features came with Java 8.
 * 
 * 
 * The advantages of using streams.
 * 1) A process can easily be converted to the multiple threads from a thread.
 * 2) Stream API has a lot of methods.
 * 3) You can process huge amount data with streams.
 * 
 * You cannot reuse data in stream, think a waterfall.
 * Methods in stream API are separated two categories.
 *  
 *  |---------------|--------------|
 * 	| Intermediate  |  Terminate   |
 * 	| 	 Method		|	Method     |
 * 	|---------------|--------------|
 * 	|	filter();	| findFirst(); |
 *  |  	map();	    |  forEach();  |
 * 	|---------------|--------------|
 *
 * 
 * https://www.quora.com/What-are-streams-in-programming 
 */


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamAPI {
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//External Iterations.
			//--------------------------------------------
			  for(int i=0; i<6; i++)
				  System.out.println(values.get(i));
			//--------------------------------------------
			  Iterator <Integer> it = values.iterator();
			  while(it.hasNext())
				  System.out.println(it.next());
			//--------------------------------------------
			  for(int i : values)
				  System.out.println(i);
			//--------------------------------------------
		
	    //Internal Iterations.
			//--------------------------------------------
			  values.forEach(t -> System.out.println(t));
			  
		
		
	}

}
