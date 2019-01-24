package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainController {

	@FXML
	private RadioButton rb1;
	@FXML
	private RadioButton rb2;
	@FXML
	private Label label;
	
	public void radioSelected(ActionEvent event) {
		
		if(rb1.isSelected()) {
			label.setText(rb1.getText());
		}
		
		if(rb2.isSelected()) {
			label.setText(rb2.getText());
		}
		
	}
	
	
}
