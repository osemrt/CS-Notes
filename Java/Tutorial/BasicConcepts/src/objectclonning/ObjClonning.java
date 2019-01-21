package objectclonning;

/*
 * There are three copy types.
 * 1) Shallow Copy
 * 2) Deep Copy
 * 3) Clonning = Shallow + Deep (you need to give the permission.)
 * 
 */

class A implements Cloneable {
	int i;
	int j;
	
	@Override
	public String toString() {
			return i + ":" + j;
		}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class ObjClonning {
	public static void main(String[] args) throws CloneNotSupportedException{
	
		//Shallow Copy - One Object, Two Reference
		A obj1 = new A();
		A obj2 = obj1;
		
		obj1.i = 10;
		System.out.println(obj1.i + ":" + obj2.i);
		//////////////////////////////////////////
		
		//Deep Copy - Copy one by one.
		A obj3 = new A();
		obj3.i = 50;
		obj3.j = 60;
		
		A obj4 = new A();
		obj4.i = obj3.i;
		obj4.j = obj3.j;
		System.out.println(obj3);
		System.out.println(obj4);
		//////////////////////////////
		
		//Clonning - Shallow + DeepCopy
		A obj5 = new A();
		obj5.i = 99;
		obj5.j = 88;
		
		A obj6 = (A) obj5.clone();
		System.out.println("--------------------");
		System.out.println(obj6);
		System.out.println(obj5);
		
		
		
		
		
	}
}
