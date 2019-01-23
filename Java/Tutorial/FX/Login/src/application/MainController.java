package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private TextField usernameText;
	@FXML
	private PasswordField passwordText;
	@FXML
	private Label status;
	
	@FXML
	public void login(ActionEvent event) throws Exception {
		
		
		if(usernameText.getText().equals("admin") && passwordText.getText().equals("pass")) {
			
			status.setText("Login Succesfully!");
			
			Stage mainStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			mainStage.setScene(scene);
			mainStage.show();
			
			
		}else {
			
			status.setText("Login Failed!");
			
		}
		
		
		
	}

}
