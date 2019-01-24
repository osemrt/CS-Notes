package application;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML 
	Label label;
	@FXML
	DatePicker datePicker;
	
	@FXML
	private void showDate(ActionEvent event) {
		LocalDate ld = datePicker.getValue();
		label.setText(ld.toString());
		
	}

}
