package callingprivatemethod;

import java.lang.reflect.Method;

import reflectionAPI.classclass.ClassEg;

public class Del {
	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("classclass.ClassEg");
		ClassEg obj = (ClassEg) c.newInstance();
		
		Method m = c.getDeclaredMethod("display", null);
		m.setAccessible(true);
		m.invoke(obj, null);		
		
	}

}
