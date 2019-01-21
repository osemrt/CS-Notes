package callingprivatemethod;

/*
 * If we can able to call private function, Why is there?
 * because reflection is for debugging and it is a trick.
 * 
 */

import java.lang.reflect.Method;

public class ReflectionDemo {
	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("callingprivatemethod.Test");
		Test t = (Test)c.newInstance();
		
		Method m = c.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(t, null);
		
		
	} 

}
