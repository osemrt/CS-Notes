package piechart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

public class MainController {
	
	@FXML
	private PieChart pieChart;
	
	@FXML
	private void loadPieChart(ActionEvent event) {
		
		ObservableList<Data> list = FXCollections.observableArrayList(
				new PieChart.Data("Java", 50),
				new PieChart.Data("c++", 40),
				new PieChart.Data("c", 20),
				new PieChart.Data("Python", 50)			
			
				);
		
		pieChart.setData(list);
		
		
	}

}
