package exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TryWithResource {
	
	public static void main(String[] args) throws Exception {
		
		/*
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is); 
		String str = br.readLine();
		*/
		
		// It closes the stream automatically in Java 1.8 or later versions. 
		// You do not need to also write finally method to do that. 
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String str = br.readLine();
		}
		
		
	}

}
