package collectionandgenerics;

import java.util.Comparator;

public class ComparatorInterfaceImp implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1%10>o2%10)
			return 1;
		if(o1%10==o2%10)
			return 0;
		return -1;
			
		
	}
}