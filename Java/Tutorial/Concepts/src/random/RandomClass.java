package random;

import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] arr = new int[50];
		
		for(int i=0; i<50; i++)
			arr[i] = r.nextInt(50);
		
		for(int i : arr)
			System.out.println(i);
		
		
	}	
}
