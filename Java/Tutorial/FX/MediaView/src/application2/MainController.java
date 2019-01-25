package application2;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController implements Initializable{
	
	@FXML
	private MediaView mediaView;
	private Media media;
	private MediaPlayer mediaPlayer;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		String path = new File("C:\\Users\\Mert\\Videos\\Captures\\video.mp4").getAbsolutePath();
		media = new Media(new File(path).toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		
		DoubleProperty width = mediaView.fitWidthProperty();
		DoubleProperty height = mediaView.fitHeightProperty();
		
		width.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
		height.bind(Bindings.selectDouble(mediaView.sceneProperty(), "height"));
		
		
	}
	
	public void play(ActionEvent event) {
		mediaPlayer.play();
		mediaPlayer.setRate(1);
	}
	
	public void pause(ActionEvent event) {
		mediaPlayer.pause();
	}
	
	public void fast(ActionEvent event) {
		mediaPlayer.setRate(2);		
	}
	
	public void reload(ActionEvent event) {
		mediaPlayer.seek(mediaPlayer.getStartTime());
		mediaPlayer.play();
	}
	
	public void slow(ActionEvent event) {
		mediaPlayer.setRate(.5);
	}
	
	public void start(ActionEvent event) {
		mediaPlayer.seek(mediaPlayer.getStartTime());
		mediaPlayer.stop();
	}
	
	public void last(ActionEvent event) {
		mediaPlayer.seek(mediaPlayer.getTotalDuration());
		mediaPlayer.stop();
		
	}
	

}
