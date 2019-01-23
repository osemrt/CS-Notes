package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainController implements Initializable{
	
	@FXML
	private ComboBox<String> comboBox;
	ObservableList<String> list = FXCollections.observableArrayList("Henry","Lucas","Paul","Jack","Megan");
	
	@FXML
	private Label myLabel;
	
	@FXML
	private Button button;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		comboBox.setItems(list);
	}
	
	@FXML
	public void comboChanged(ActionEvent event) {
		myLabel.setText(comboBox.getValue());
				
	}
	@FXML
	public void buttonActived(ActionEvent event) {
		comboBox.getItems().addAll("Eddy", "Leo", "Thomas");
	}

}
