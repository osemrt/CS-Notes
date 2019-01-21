package collectionandgenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
	int rollNo;
	int marks;
	
	public Students(int rollNo, int marks){
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student{" + "rollNo=" + rollNo + ", marks=" + marks + ")";
	}
	
	
	
}

public class ComparatorInterface2 {
	public static void main(String[] args) {
		
		List<Students> studs = new ArrayList<Students>();
		
		Students obj1 = new Students(15, 54);
		Students obj2 = new Students(1, 80);
		Students obj3 = new Students(94, 22);
		Students obj4 = new Students(45, 64);
		Students obj5 = new Students(83, 38);
		
		studs.add(obj1);
		studs.add(obj2);
		studs.add(obj3);
		studs.add(obj4);
		studs.add(obj5);
		
		
		Comparator<Students> com = new ComparatorInterfaceImp2();
		Collections.sort(studs, com);
		
		for(Students s : studs)
			System.out.println(s);
		
		
	}

}
