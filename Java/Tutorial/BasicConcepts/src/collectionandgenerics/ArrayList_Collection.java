package collectionandgenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * There are two ways to do that.
 * 1- Iterator
 * 2- Enhanced For Loop
 * 
 * We can not add an element to any specific index.
 * 
 */

public class ArrayList_Collection {
	public static void main(String[] args) {
		
		
		////Collection<Integer> values = new ArrayList<Integer>();
		Collection values = new ArrayList();
		values.add(2);
		values.add("Hello!");
		values.add(4.5);
		values.add(6.4f);
		
		values.remove(2);
		
		/*
		 * //Iterator Technique
		Iterator it = values.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*
		*/
		
		////for(int/Integer i : values){
		for(Object i : values) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}
