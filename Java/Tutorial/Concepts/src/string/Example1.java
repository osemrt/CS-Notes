package string;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		
		System.out.println("Enter two strings...");
		
		//Get Input From The User
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		//String Concerate
		String s3 = s1.concat(s2);
		System.out.println(s3);		
		System.out.println(s1 + s2);
		
		//String Length
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		//String toUppercase
		s1 = s1.toUpperCase();
		System.out.println(s1);	
		

	}

}
