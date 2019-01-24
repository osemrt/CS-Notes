package application;

import java.io.File;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;



public class MainController {
	
	@FXML
	private ListView listView1;
	@FXML
	private ListView listView2;

	
	public void button1Action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("E:\\Documents"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files", "*.pdf"));
		File selectedFile = fc.showOpenDialog(null);
		
		if(selectedFile != null) {
			listView1.getItems().add(selectedFile.getName());
			listView2.getItems().add(selectedFile.getAbsolutePath());
			
		}else {
			System.out.println("File is not valid!");
		}
		
		
	}
	
	public void button2Action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("E:\\Documents"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files", "*.pdf"));
		List <File> selectedFiles = fc.showOpenMultipleDialog(null);
		
		if(selectedFiles != null) {
			for ( File temp : selectedFiles ) {
				listView1.getItems().add(temp.getName());
				listView2.getItems().add(temp.getAbsoluteFile());
			}
			
			/*
			 * for(int i=0; i<selectedFiles.size(); i++){
			 * 		
			 * 		listView1.getItems().add(selectedFiles.get(i).getAbsoluteFile());
					listView2.getItems().add(selectedFiles.get(i).getName());			 
			 * }
			 * 
			 */
				
			
		}else {
			System.out.println("File is not valid!");
		}
			
		
		
	}
	
	
}
