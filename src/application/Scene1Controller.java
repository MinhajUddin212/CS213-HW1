package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene1Controller {
	@FXML
	private ListView <String> MAINLIST;
	
	@FXML
	private Button Add;
	
	@FXML
	private Label nameDetail;
	
	@FXML
	private Label artistDetail;
	
	@FXML
	private Label albumDetail;
	
	@FXML
	private Label yearDetail;
	
	
	//Read Json file and show in listview
	
	
	public void addSong(ActionEvent e) {
//		System.out.println("Hello");
		String [] temp1 = {"hello", "world","test"};
		String temp = "artist - song";
		MAINLIST.getItems().add(temp);	
	}
	
	public void GoToScene2(ActionEvent e) throws IOException {
        AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();    
    }
}
