package slider;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class MainController implements Initializable {
	
	@FXML
	private Slider slider;
	@FXML
	private TextField field;
	
	private static final double INIT_VALUE = 50;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		slider.setValue(INIT_VALUE);
		field.setText(Double.toString(INIT_VALUE));		
		field.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getInstance());
		
	}

}
