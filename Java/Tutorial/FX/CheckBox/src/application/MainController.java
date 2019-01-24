package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private CheckBox cb1;
	@FXML
	private CheckBox cb2;
	@FXML
	private CheckBox cb3;
	@FXML
	private CheckBox cb4;
	@FXML
	private Label label1;
	@FXML
	private Label label2;
	
	
	
	public void checkEvent(ActionEvent event) {
		
		int num = 0;
		String msg = "";
		
		if(cb1.isSelected()) {
			num++; 
			msg += cb1.getText() + "\n";
		}
		
		if(cb2.isSelected()) {
			num++;
			msg += cb2.getText() + "\n";
		}
		
		if(cb3.isSelected()) {
			num++;
			msg += cb3.getText() + "\n";
		}
		
		if(cb4.isSelected()) {
			num++;
			msg += cb4.getText() + "\n";
		}
		
		
		label1.setText(Integer.toString(num));
		label2.setText(msg);
		
		
	}
	
	
	
	

}
