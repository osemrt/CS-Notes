package collectionandgenerics;

import java.util.Comparator;

public class ComparatorInterfaceImp2 implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		if(o1.marks>o2.marks)
			return 1;
		if(o1.marks==o2.marks)
			return 0;
		return -1;
	}

}
