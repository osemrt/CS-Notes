package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class MyNumber {
	
	private DoubleProperty number;

	/**
	 * @return the number
	 */
	public double getNumber() {
		if(number!=null)
			return number.get();
		return 0;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(double number) {
		numberProperty().set(number);
	}
	
	
	public DoubleProperty numberProperty() {
		if(number==null)
			number = new SimpleDoubleProperty(0);
		return number;
	}
	

}




