package application;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class newListController {
	
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
	public String[] leftWords = new String[1];
	public String[] rightWords = new String[1];
	
	int elementArrays = 0;
	
	public void addNewWord(ActionEvent event) {
		String leftWord = null;
		String rightWord = null;
		try {
			leftWord = leftField.getText();
			rightWord = rightField.getText();
		} catch (Exception failString) {
			System.out.println("Mfer failed");
		}
		System.out.println(leftWord + " " + rightWord);
	}
	public void deleteWordPressed(ActionEvent event) {}
	public void saveListPressed(ActionEvent event) {}
	public void returnHomePressed(ActionEvent event) {}

}
