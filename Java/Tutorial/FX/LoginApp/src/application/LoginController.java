package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable{

	@FXML
	Label label;
	@FXML
	TextField textField;
	@FXML
	PasswordField passwordField;
	
	
	public LoginModel loginModel = new LoginModel();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(loginModel.isDbConnected()) {
			label.setText("Connected");
		}else {
			label.setText("Not Connected");
		}
			
		
	}
	
	public void login(ActionEvent event) throws SQLException, IOException {
		
		if(loginModel.isLogin(textField.getText(), passwordField.getText())) {
			label.setText("Username and Password is correct");
			((Node)event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			Parent root = loader.load(getClass().getResource("User.fxml").openStream());
			UserController user = (UserController)loader.getController();
			user.showMessage(textField.getText() + passwordField.getText());
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}else {
			label.setText("Check the credentials!");
		}
	
	}

}
