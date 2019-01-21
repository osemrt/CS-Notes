package string;

/*
 * in Java, every class extends Object Class indireclty!
 */

class Student extends Object{
	int rollNo;
	String sname;
	
	
	public Student(int rollNo, String sname) {
		this.rollNo = rollNo;
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "Student{ " + "rollName:" + rollNo + "sname:" + sname + " }";
	}
	
}


public class Example2{
	public static void main(String[] args) {
		Student s1 = new Student(12, "Kevin");
		// it automatically calls s1.toString(); in the Object class.
		// Whenever you create an object in Java, It will go into a virtualbox
		// or some type of memory. That box will have a value and there are
		// multiple object code in this box, and each of object has an unique code(hashCode).
		//
		System.out.println(s1); 
		
	
	
		
								
		
	}

}
