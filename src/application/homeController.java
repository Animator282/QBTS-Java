package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class homeController {
	@FXML
	private Button button;
	
	public void initialize() {
        // TODO
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
