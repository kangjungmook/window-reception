package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Screen11Controller implements Initializable {
	
	@FXML Button btnSecond;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	public void  btnSecondAction(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Screen22.fxml"));
			Stage stage = new Stage();
			stage.setTitle("화면전환프로그램");
			stage.setScene(new Scene(root, 600, 400));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
