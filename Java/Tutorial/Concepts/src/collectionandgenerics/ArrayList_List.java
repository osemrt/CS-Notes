package collectionandgenerics;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_List {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(40);
		values.add(2);
		values.add(64);
		values.add(23);
		values.add(94);
		values.add(2);
		
		values.add(2, 100);
		
		values.forEach(System.out::println); // Stream API.. Lambda Expression...
		
		System.out.println("----------------------");
		Collections.sort(values);
		
		values.forEach(System.out::println);
		
		
		
	}

}
