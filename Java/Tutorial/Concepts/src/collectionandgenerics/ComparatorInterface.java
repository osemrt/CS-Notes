package collectionandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
	public static void main(String[] args) {
		
		List values = new ArrayList();
		
		values.add(232);
		values.add(531);
		values.add(938);
		values.add(325);
		values.add(237);
		values.add(220);
		values.add(129);
		values.add(536);
		
		Comparator<Integer> com = new ComparatorInterfaceImp();
		Collections.sort(values, com);
		
		System.out.println(values);
		
		
	}

}
