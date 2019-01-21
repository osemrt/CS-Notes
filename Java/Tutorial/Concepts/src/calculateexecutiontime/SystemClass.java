package calculateexecutiontime;

public class SystemClass {
	public static void main(String[] args) { 
		
		long startPoint = System.currentTimeMillis(); // mills from jan 1st 1970.
		
		for(int i=0; i<1000000; i++)
			System.out.println(i);
		
		long endPoint = System.currentTimeMillis();	
		
		long time = (endPoint - startPoint)/1000;
		
		System.out.println(time);
		
	}

}
