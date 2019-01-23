package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
	
	@FXML
	private Label myMessage; 
	
	public void generateRandomNumber(ActionEvent event) {
		
		
		
		Random r = new Random();
		int num = r.nextInt(50);
		System.out.println(num);
		myMessage.setText(Integer.toString(num));
		
		
		
	}	
}
