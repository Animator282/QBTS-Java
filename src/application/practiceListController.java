package application;

import java.util.*;
import java.io.*;


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
	public HashMap<String, String> questionAndAnswer;
	
	@FXML
	public void initialize() {

	}
	
	
	public void setList(String nameList, HashMap<String, String> namePath) {
		//Get name of list an list of names and paths
		listToRead = nameList;
		nameAndPath = namePath;
		System.out.println("STRIIIIIIING: " + listToRead + "    HASHMAPPIE: " + nameAndPath);
		
		if (nameAndPath.containsKey(listToRead)) {
			//Algorithm to read listFile
			try {
				//Open file and make scanner
				File listRead = new File(nameAndPath.get(listToRead));
				Scanner readList = new Scanner(listRead);
				while (readList.hasNext()) {
					String data = readList.nextLine();
					String data2 = readList.nextLine();
			        System.out.println(data);
			        System.out.println(data2);
				}
				readList.close();
				
				
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			System.out.println("Correct list name has been loaded");
			
			
			
			
			
			
			
			
			
			
		}
		else {
			System.out.println("WTF BIG ASS ERROR????? HOW DID THIS EVEN HAPPEN!!!!");
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
