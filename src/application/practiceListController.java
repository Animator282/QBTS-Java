package application;

import java.util.*;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.*;

public class practiceListController {
	
	Main main = new Main();
	
	@FXML private Button returnButton;
	@FXML private Button checkButton;
	@FXML private Label listDisplay;
	@FXML private Label questionProgress;
	@FXML private Label questionLabel;
	@FXML private TextField answerTextField;
	@FXML private ProgressBar progressList;
	
	public String listToRead;
	
	public HashMap<String, String> nameAndPath;
	
	@FXML
	public void initialize() {

	}
	
	
	public void setList(String nameList, HashMap<String, String> namePath) {
		listToRead = nameList;
		nameAndPath = namePath;
		System.out.println("STRIIIIIIING: " + listToRead + "    HASHMAPPIE: " + nameAndPath);
		
		if (nameAndPath.containsKey(listToRead)) {
			System.out.println("Hmmm yes it true");
		}
	}
	
	
	public void onReturnButtonPressed(ActionEvent event) {
		//Get stage
		Stage thisStage = (Stage) returnButton.getScene().getWindow();
		//Search lists
		//homeC.checkLists();
		//Change scene to home
		main.changeScene(thisStage, "home.fxml", "QBTS Home");
	}
	
	public void onCheckPressed(ActionEvent event) {
		
	}
	
}
