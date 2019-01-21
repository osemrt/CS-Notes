package classclass;

/*
 * in Java, whenever an interface or a class is compiled, a file is created by compiler with .class extension, 
 * If you want to know that this file is a class or an interface, look the part 1.
 * 
 */

class A extends classclass.ClassEg{
	
}


public class ClassClass{
	public static void main(String[] args) throws Exception {
		
		//Part1
		Class c1 = Class.forName("classclass.ClassEg");
		Class c2 = Class.forName("classclass.InterfaceEg");
		Class c3 = Class.forName("classclass.A");
		
		
		System.out.println(c1.isInterface());
		System.out.println(c2.isInterface());
		
		System.out.println(c1.getSuperclass()); // every class in Java extends Object!
		System.out.println(c2.getSuperclass());
		System.out.println(c3.getSuperclass());	
		
		
	}

}
