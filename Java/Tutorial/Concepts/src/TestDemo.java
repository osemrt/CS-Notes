
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



public class TestDemo {
	public static void main(String[] args) {
		
		List <Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		
		Consumer c = t -> System.out.println(t);
			
		
		
		values.forEach(c);
		
		
		
		
		
	}

}
