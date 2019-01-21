package collectionandgenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students2 implements Comparable<Students2>{
	int rollNo;
	int marks;
	
	public Students2(int rollNo, int marks){
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student{" + "rollNo=" + rollNo + ", marks=" + marks + ")";
	}

	@Override
	public int compareTo(Students2 o) {
		return this.marks>o.marks?-1:this.marks<o.marks?1:0;
	}

	
	
	
	
}

public class ComparableInterface {
	public static void main(String[] args) {
		
		List<Students2> studs = new ArrayList<Students2>();
		
		Students2 obj1 = new Students2(15, 54);
		Students2 obj2 = new Students2(1, 80);
		Students2 obj3 = new Students2(94, 22);
		Students2 obj4 = new Students2(45, 64);
		Students2 obj5 = new Students2(83, 38);
		
		studs.add(obj1);
		studs.add(obj2);
		studs.add(obj3);
		studs.add(obj4);
		studs.add(obj5);
		
		Collections.sort(studs);
		
		for(Students2 s : studs)
			System.out.println(s);
		
		
	}

}
