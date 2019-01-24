package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable{
	
	@FXML
	private TableView<Student> tableView;
	@FXML
	private TableColumn<Student, Integer> id;
	@FXML
	private TableColumn<Student, String> surname;
	@FXML
	private TableColumn<Student, String> name;
	@FXML
	private TableColumn<Student, Integer> age;
	
	public ObservableList<Student> list = FXCollections.observableArrayList(
			new Student (1, "Eddy", "Bear", 19),
			new Student (2, "Mick", "Thomson", 23),
			new Student (3, "Bruno", "Olive", 31),
			new Student (4, "Ketty", "Terr", 42),
			new Student (5, "Megan", "Nase", 51),
			new Student (6, "Alber", "Hooke", 29)		
			
			);
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		id.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
		surname.setCellValueFactory(new PropertyValueFactory<Student, String>("surname"));
		name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		age.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
		tableView.setItems(list);
		
		
	}

}
