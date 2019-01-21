package collectionandgenerics;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * All elements must be unique in a Set.
 * Hashset - > does not give elements sequentially.
 * Treeset - > you obtain elements in ascending order.
 * 
 * 
 * 
 */

public class SetInterface {
	public static void main(String[] args) {
		
		Set<Integer> values = new HashSet<Integer>();
		
		System.out.println(values.add(23));
		System.out.println(values.add(19));
		System.out.println(values.add(54));
		System.out.println(values.add(72));
		System.out.println(values.add(23)); // it is false (no duplicated element!)
		
		for(int i : values) { 
			System.out.println(i);
		}
		
		Set<Integer> values2 = new TreeSet<Integer>();
		values2.add(194);
		values2.add(194);
		values2.add(194);
		values2.add(194);
		values2.add(194);
		values2.add(632);
		values2.add(100);
		values2.add(321);
		
		
		for(int i : values2) {
			System.out.println(i);
		}
	}
}
