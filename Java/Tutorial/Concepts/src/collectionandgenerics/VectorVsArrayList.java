package collectionandgenerics;

import java.util.Vector;

/*
 * If someone says you that you use vector after starting using of Vector.
 * 
 * Vector -> Dynamic Array
 * 
 * Vector    -> %100 (occupy memory)
 * -	Every method in Vector is synchronized (ThreadSafe) // slow
 * ArrayList -> %50 // Not ThreadSafe // fast
 * 
 * 
 */

public class VectorVsArrayList {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(15);
		v.add(198);
		v.add(2);
		
		v.remove(2); // to remove an element.
		
		System.out.println(v.capacity()); // default capacity is 10.
		
		v.add(15);
		v.add(198);
		v.add(2);
		v.add(15);
		v.add(198);
		v.add(2);
		v.add(15);
		v.add(198);
		v.add(2);
		v.add(15);
		v.add(198);
		v.add(2);
		
		System.out.println(v.capacity()); // If you excess the capacity of vector, It increase own capacity.(duplicate)
		
		for(int i : v ) {
			System.out.println(i);
		}
		
	}

}
