package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/*
 * 
 * JavaFX properties store the inner state of a control and allow us to listen 
 * to change from JavaFX UI controls. That means you will be able to perform an 
 * action when the value changes.
 * 
 * Types : Read/Write or Read Only.
 * 
 * 
 * Read/Write
 * ------------
 * javafx.beans.property.SimpleStringProperty
 * javafx.beans.property.SimpleDoubleProperty
 * javafx.beans.property.SimpleIntegerProperty
 * javafx.beans.property.SimpleBooleanProperty
 * 
 * Read Only
 * -----------
 * javafx.beans.property.ReadOnlyStringWrapper
 * javafx.beans.property.ReadOnlyDoubleWrapper
 * javafx.beans.property.ReadOnlyIntegerWrapper
 * javafx.beans.property.ReadOnlyBooleanWrapper
 * 
 * 
 */

public class MainController implements Initializable {

	
	MyNumber myNum = new MyNumber();
	@FXML
	private Label label;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) { 
		myNum.setNumber(0);
		ChangeListener<Object> listener = new ChangeListener<Object>() {
			@Override
			public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
				label.setText(Double.toString(myNum.getNumber()));
			}
		};
		
	myNum.numberProperty().addListener(listener);
		
		
	}	
	
	
	public void ButonClicked(ActionEvent event) {
		myNum.setNumber(myNum.getNumber() +1 );
		
	}
	

}
