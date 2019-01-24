package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;


public class MainController {
	
	public void closeApp(ActionEvent event) {
		Platform.exit(); // to exit from JavaFX
		System.exit(0);  
	}

}
