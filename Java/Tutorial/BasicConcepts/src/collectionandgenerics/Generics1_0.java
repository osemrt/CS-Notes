package collectionandgenerics;

/*
 * If you do not define any generic type, it will be raw type<?>.
 * This means that this class accepts all types.
 * You do not send any primitive datatypes as Generic to a class.
 * 
 */


import java.util.ArrayList;
import java.util.Collection;

class A <T> {
	
	T value;
	public void show() {
		
		System.out.println(value.getClass().getName());
	}
}


public class Generics1_0 {
	public static void main(String[] args) {

		Collection values = new ArrayList();
		values.add(2);
		values.add(2);
		values.add(2);
		values.add(0);
		values.add(2);
		
		System.out.println(values);
		
	}

}
