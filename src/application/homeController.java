package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class homeController {
	
	public Scene scene, scene2;
	
	//ONTHOUD, ACHTER ELK FXML DING = "@FXML" ANDERS DOET IE NIET
	
	Main main = new Main();
	
	
	@FXML
	private Button button;
	
	@FXML
	private Label welcomeDisplay;
	
	
	
	@FXML
	public void initialize() {
		welcomeDisplay.setText("Welcome!");
    }
	


	@FXML
	private void makeNewList(ActionEvent event) {
		Stage thisStage = (Stage) button.getScene().getWindow();
		main.changeScene(thisStage, "newList.fxml");
		
	}
	
	@FXML
    private void quitButtonPressed(ActionEvent event) {
		// get a handle to the stage
		//Stage stage = (Stage) button.getScene().getWindow();
		// do what you have to do
		//stage.close();
		System.exit(0);
    }
}
