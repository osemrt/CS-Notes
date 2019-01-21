package gettinginputfromuser;

// resources.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GettingInputFromUser2 {
	
	public static void main(String[] args) throws IOException {
			
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str = br.readLine();
		// you should close the buffers that you used after they do their jobs.
		// If you handle any exception by using try-catch, you should write stream clsoe statements to finally block.
		br.close();
		
		System.out.println(str);
		
	}	

}
