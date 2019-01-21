package markerinterface;

import java.io.Serializable;

/*
 * If a interface has no method(declaration), this interface is called as Marker Interface.
 * I want some permission to any person in order to use my class, so, I can make it with 
 * marker interfaces, Look examples.
 * 
 * Some Marker Interfaces
 * 1) Serializable - You can permission the person to save the object in local memory.
 * 2) Remote       - You can create remote objects with this permission.
 * 
 * 
 */

interface Permission{}



class A implements Permission, Serializable, Runnable{
	public void show() {
		System.out.println("in A");
	}
}

class B{
	public void show() {
		System.out.println("in B");
	}
	
}

public class Marker {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		
		
		if(obj1 instanceof Permission )
			obj1.show();
		
		if(obj2 instanceof Permission )
			obj2.show();
		
		
		Class<?>[] abc = obj1.getClass().getInterfaces();		
		for(Class<?> i : abc)
			System.out.println(i.toString());
		
		
	}

}
