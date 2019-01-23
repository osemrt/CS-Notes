import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label myMessage;
	

	public void clicker(ActionEvent event) {
		
		String str = ((Button)event.getSource()).getText();
		myMessage.setText(str);
		
	}

}
