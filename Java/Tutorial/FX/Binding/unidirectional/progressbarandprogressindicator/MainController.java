package progressbarandprogressindicator;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class MainController implements Initializable {
	
	@FXML
	private ProgressBar pb;
	@FXML
	private ProgressIndicator pi;
	@FXML
	private Label label;
	
	MyNumber mynum = new MyNumber();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mynum.setNumber(0);
		
		ChangeListener listener = new ChangeListener() {

			@Override
			public void changed(ObservableValue observable, Object oldValue, Object newValue) {
				label.setText(Double.toString(mynum.getNumber()));
				pb.progressProperty().bind(mynum.numberProperty());
				pi.progressProperty().bind(mynum.numberProperty());
			}
		};
		
		mynum.numberProperty().addListener(listener);
		
	}
	
	public void butonClicked1(ActionEvent event) {
		mynum.setNumber(mynum.getNumber() + 0.1);
	}
	
	public void butonClicked2(ActionEvent event) {
		mynum.setNumber(mynum.getNumber() - 0.1);
	}

}




