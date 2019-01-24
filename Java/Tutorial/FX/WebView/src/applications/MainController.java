package applications;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable {

	
	@FXML
	private WebView webView;
	private WebEngine engine;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		engine = webView.getEngine();		
		
	}
	
	
	public void button1 (ActionEvent event) {
		engine.load("https://www.google.com");
	}
	
	public void button2 (ActionEvent event) {
		engine.executeScript("window.location = \"http://www.facebook.com//\";");
	}

	public void button3 (ActionEvent event) {
		engine.loadContent("<html><body><h1>Hello World!</h1></body></html>");
	}

	public void button4 (ActionEvent event) {
		engine.reload();
	
	}
	
	
	

}
