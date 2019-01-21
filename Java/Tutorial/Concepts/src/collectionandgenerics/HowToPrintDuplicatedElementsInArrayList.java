package collectionandgenerics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HowToPrintDuplicatedElementsInArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> values = new ArrayList<String>();
		values.add("Eric");
		values.add("Henry");
		values.add("Kevin");
		values.add("Bob");
		values.add("Eric");
		values.add("Henry");
		
		for(String s : values) {
			System.out.println(s);
		}
		
		System.out.println("--------------");
		
		Set<String> values2 = new HashSet<String>();
		
		for(String s : values) {
			if(values2.add(s)==false)
				System.out.println(s);
		}
		
		
	}

}
