package string;



 

public class Split {
	
	public static void main(String[] args) {
		
		String str = "abc 123 def 456";
		String tokens1[] = str.split(" ");
		
		System.out.println(tokens1[0]);
		System.out.println(tokens1[1]);
		System.out.println(tokens1[2]);
		System.out.println(tokens1[3]);
		
		String tokens2[] = StringUtils.split(str, " ");
		
		System.out.println(tokens2[0]);
		System.out.println(tokens2[1]);
		System.out.println(tokens2[2]);
		System.out.println(tokens2[3]);
		
		System.out.println("--------------------------------");
		
		String str2 = "Message to Evan Hello Everyone ! ... I'am Mike. ";
		String tokens3[] = StringUtils.split(str2, " ", 4);
		
		System.out.println(tokens3[0]);
		System.out.println(tokens3[1]);
		System.out.println(tokens3[2]);
		System.out.println(tokens3[3]);

		
		
	}

}
