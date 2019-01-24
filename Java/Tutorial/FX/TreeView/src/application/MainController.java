package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Icon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController implements Initializable {

	
	@FXML
	TreeView<String> treeView;
	
	
	Image icon = new Image(getClass().getResourceAsStream("/img/icon.png"), 15, 15,false, false);
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		TreeItem<String> root = new TreeItem<String>("Root", new ImageView(icon));
		treeView.setRoot(root);
		
		TreeItem<String> nodeA = new TreeItem<String>("nodeA", new ImageView(icon));
		TreeItem<String> nodeB = new TreeItem<String>("nodeB", new ImageView(icon));
		TreeItem<String> nodeC = new TreeItem<String>("nodeC", new ImageView(icon));
		TreeItem<String> nodeD = new TreeItem<String>("nodeD", new ImageView(icon));
		
		root.getChildren().addAll(nodeA, nodeB, nodeC);
		nodeA.getChildren().addAll(nodeB, nodeC);
		
		
		
	}

}
