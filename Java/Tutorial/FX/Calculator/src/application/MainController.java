package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label result;
	private long number1 = 0;
	private String operator = "";
	private boolean start = true;
	private Model model = new Model();
	
	
	@FXML
	public void processNumbers(ActionEvent event) {
		
		if(start) {
			result.setText("");
			start = false;
		}
		
		String val = ((Button)event.getSource()).getText();
		result.setText(result.getText() + val);
		
	}
	
	@FXML
	public void processOperators(ActionEvent event) {
		
		String val = ((Button)event.getSource()).getText();
		
		if(val.equals("=")) {
			if(val.equals(""))
				return ;
			long number2 = Long.parseLong(result.getText());
			
			long output = model.calculate(number1, number2, operator);
			result.setText(Long.toString(output));
			start = true;
			
			
		}else {
			
			number1 = Long.parseLong(result.getText());
			operator = val;
			result.setText("");
			
		}
			

		
	}

}
