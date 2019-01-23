package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable{
	
	@FXML
	ListView<String> listView;
	ObservableList<String> list = FXCollections.observableArrayList("Henry","Lucas","Paul","Jack","Megan");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listView.setItems(list);
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	public void buttonClicked1(ActionEvent event){
		ObservableList<String> names = listView.getSelectionModel().getSelectedItems();
		for(String name : names) {
			System.out.println(name);
		}
		
	}
	
	
	public void buttonClicked2(ActionEvent event) {
		listView.getItems().addAll("Adam", "Emily", "Lee", "Steward");
	}
	
	

}




