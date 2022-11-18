package application;

import java.util.ArrayList;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.*;

public class newListController {
	
	//Initializing the Main method
	Main main = new Main();
	
	//Initialization of nodes
	@FXML private VBox vboxL;
	@FXML private VBox vboxR;
	@FXML private HBox scrollBox;
	@FXML public Button addWord;
	@FXML public Button deleteWord;
	@FXML public Button saveList;
	@FXML private Button returnToHome;
	@FXML public TextField leftField;
	@FXML public TextField rightField;
	
	//Arrays for storing Strings
	public ArrayList<String> leftWords = new ArrayList<String>();
	public ArrayList<String> rightWords = new ArrayList<String>();
	
	int elementArrays = 0;
	
	
	public void enterKeyPressed(KeyEvent e) {
		if(e.getCode() == KeyCode.ENTER)
	    {
	        addNewWord(null);
	    }
	}
	
	public void addNewWord(ActionEvent event) {
		String leftWord = null;
		String rightWord = null;
		//Get text from text fields
		try {
			leftWord = leftField.getText();
			rightWord = rightField.getText();
		} catch (Exception failString) {
			System.out.println("Mfer failed");
		}
		System.out.println(leftWord + " " + rightWord);
		
		//Add text to specific array
		leftWords.add(leftWord);
		rightWords.add(rightWord);
		
		
		Label addLabel1 = new Label((elementArrays + 1) + ": " + leftWord);
		Label addLabel2 = new Label((elementArrays + 1) + ": " + rightWord);
		
		//Add label to GUI
		vboxL.getChildren().add(addLabel1);
		vboxR.getChildren().add(addLabel2);		
		
		//Count goes up by 1ß
		elementArrays++;
		
	}
	public void deleteWordPressed(ActionEvent event) {}
	public void saveListPressed(ActionEvent event) {}
	public void returnHomePressed(ActionEvent event) {}

}
