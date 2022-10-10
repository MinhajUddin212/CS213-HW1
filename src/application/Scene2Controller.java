package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;

import application.Song;


public class Scene2Controller {
	
	@FXML
	private TextField name;
	@FXML
	private TextField artist;
	@FXML
	private TextField album;
	@FXML
	private TextField year;
	@FXML
	private Button apply;
	@FXML
	private Button cancel;
	
	public void GoToScene1(ActionEvent e) throws IOException {
        AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();    
    }
	
	public void applyChanges(ActionEvent e) throws IOException{
		//Get input
		String songName = name.getText();
		String artistName = artist.getText();
		String albumName = album.getText();
		int songYear = Integer.parseInt(year.getText());
		
		//Check if name or artist is empty
		if(songName.isEmpty() || artistName.isEmpty() ) {
			createErrorAlert("Add Error", "Must add song name and artist");
			return;
		}
		//if everything is correct then create a new song
		Song newSong = new Song(songName, artistName, albumName, songYear);
		
		//check if song already exists
		//sort the list
		//display the sorted list
	}
	
	public void createErrorAlert(String errorTitle, String errorMessage) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle(errorTitle);
		alert.setHeaderText(null);
		alert.setContentText(errorMessage);
		alert.showAndWait();
	}
}
