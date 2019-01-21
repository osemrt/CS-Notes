package anoynmousobj;

/*
 * 	
 *  1) It will not use any memory in stack.
 *  2) This will be eligible for Garbage Collection.
 * 
 */

class A{
	int num;
	public void show(){
		System.out.println("Abc");   
	}
	
	public void display() {
		System.out.println(this.num);
	}
}

public class AnonymousObject {
	public static void main(String[] args) {
		new A().num = 20;		
		new A().show(); // calling a function with anonymous object.
		
	}

}
