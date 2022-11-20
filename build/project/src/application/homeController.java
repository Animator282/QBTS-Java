package application;

import java.util.*;
import java.io.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.collections.*;




public class homeController {
	
	public Scene scene, scene2;
	
	//ONTHOUD, ACHTER ELK FXML DING = "@FXML" ANDERS DOET IE NIET
	
	Main main = new Main();
	
	String[] listNames;
	
	@FXML private Button button;
	@FXML private Button newList;
	@FXML private Button practiceButton;
	@FXML private Label welcomeDisplay;
	@FXML private VBox scrollBox;
	@FXML private ChoiceBox<String> practiceListPicker;
	
	public HashMap<String, String> nameAndPath = new HashMap<String, String>();
	
	
	@FXML
	public void initialize() {
		welcomeDisplay.setText("Welcome!");
		
		//Check if new lists are made
		checkLists();
		
		ObservableList<String> availableChoices = FXCollections.observableArrayList(listNames); 
		practiceListPicker.setItems(availableChoices);
		
		
    }
	
	
	public void onPracticePressed() {
		String selectedChoice = practiceListPicker.getSelectionModel().getSelectedItem();
		System.out.println(selectedChoice);
	}
	
	
	public void checkLists() {
		File saveFolder = new File(System.getProperty("user.dir") + "/saves");
		listNames = saveFolder.list();
		for (String pathname : listNames) {
            // Print the names of files and directories
            System.out.println(pathname);
            
            //Add file path and file name to hashmap
            nameAndPath.put(pathname, System.getProperty("user.dir") + "/saves/" + pathname);
            
            //Display lists
            Label addLabel = new Label(pathname);
            scrollBox.getChildren().add(addLabel);
            System.out.println(nameAndPath);
        }
	}

	@FXML
	private void makeNewList(ActionEvent event) {
		Stage thisStage = (Stage) button.getScene().getWindow();
		main.changeScene(thisStage, "newList.fxml", "New List");
		
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
