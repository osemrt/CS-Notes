package testpackage;


class Calculator{ // super, parent, base
	
	Calculator(){
		System.out.println("in Calculator");		
	}
	
	Calculator(int i){
		System.out.println("in Calculator -> int");		
	}
	
	int add(int i, int j) {
		return i + j;		
	}	
		
}


class AdvancedCalculator extends Calculator{ // sub, child, derived
	
	AdvancedCalculator(){
		super();
		System.out.println("in AdvancedCalculator");		
	}	
	
	AdvancedCalculator(int i){
		super(i);
		System.out.println("in AdvancedCalculator -> int");		
	}
	
	int substract(int i, int j) {
		return i - j;
	}	
	
}

class VeryAdvancedCalculator extends AdvancedCalculator{
	
	VeryAdvancedCalculator(){
		super();
		System.out.println("in VeryAdvancedCalculator");		
	}	
	
	VeryAdvancedCalculator(int i){
		super(i);
		System.out.println("in VeryAdvancedCalculator -> int");		
	}
	
	int multiply(int i, int j) {
		return i * j;
	}
	
	int divide(int i, int j) {
		return i / j;
	}	
	
}




public class InheritanceDemo {
	
	public static void main(String args[]) {
		
				
		
	}
	
	

}
