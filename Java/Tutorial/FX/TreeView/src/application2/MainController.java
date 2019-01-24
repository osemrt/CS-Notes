package application2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable{

	
	@FXML
	private Label label;
	
	@FXML
	private TreeView<String> treeView;	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TreeItem<String> root = new TreeItem<String>("Root");
		treeView.setRoot(root);
		
		TreeItem<String> nodeA = new TreeItem<String>("nodeA");
		TreeItem<String> nodeB = new TreeItem<String>("nodeB");
		TreeItem<String> nodeC = new TreeItem<String>("nodeC");
		TreeItem<String> nodeD = new TreeItem<String>("nodeD");
		
		root.getChildren().addAll(nodeA, nodeB, nodeC, nodeD);
		root.setExpanded(true);
		
	}
	
	
	public void mouseClick(MouseEvent mouseEvent) {
		
		if (mouseEvent.getClickCount() == 2) {
			TreeItem<String> node = treeView.getSelectionModel().getSelectedItem();
			System.out.println(node.getValue());
		}
		
		
	}
	
	
	
	
	
	

}




