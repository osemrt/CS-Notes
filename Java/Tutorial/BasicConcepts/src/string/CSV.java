package string;

/*
 * CSV : Comma Seperated Values
 * 
 */

public class CSV {
	public static void main(String[] args) {
		
		String str = "Lucas, Eric, Mark, Thomas, Warnick";
		String names[] = str.split(",");
		for(String val : names)
			System.out.println(val);
		
		
		String str2 = "Apple!* , Sams ung,/,";
		String names2[] = str.split("! ,*/");
		for(String val : names)
			System.out.println(val);
		
		
		
	}

}
