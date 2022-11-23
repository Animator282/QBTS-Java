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

public class practiceListController {
	
	Main main = new Main();
	
	@FXML private Button returnButton;
	@FXML private Button checkButton;
	@FXML public Label listDisplay;
	@FXML private Label questionProgress;
	@FXML private Label questionLabel;
	@FXML private TextField answerTextField;
	@FXML private ProgressBar progressList;
	
	public static int currentQuestion = 0;
	public static int questionsCorrect = 0;
	public static double currentQuestionDouble = 0.00;
	public static int questionsFinished = 0;
	
	public String listToRead;
	public static String listToDisplay;
	
	public static boolean shuffled = false;
	
	public HashMap<String, String> nameAndPath;
	public static HashMap<String, String> questionAndAnswer = new HashMap<String, String>();
	
	public static ArrayList<String> questionsOnly = new ArrayList<String>();
	public static ArrayList<String> answersOnly = new ArrayList<String>();
	
	public void initialize() {
		System.out.println(checkButton + "  " + questionLabel + "  " + listDisplay);
		listDisplay.setText("Practicing: " + listToDisplay);
		questionLabel.setText("Press Start");
		checkButton.setText("Start");
		
		
	}
	
	
	public void setDisplayName(String name) {
		listToDisplay = name;
	}

	public void setList(String nameList, HashMap<String, String> namePath) {
		//Get name of list an list of names and paths
		listToRead = nameList;
		System.out.println(listDisplay);
		nameAndPath = namePath;
		setDisplayName(listToRead);
		System.out.println("STRIIIIIIING: " + listToRead + "    HASHMAPPIE: " + nameAndPath);
		
		if (nameAndPath.containsKey(listToRead)) {
			//Algorithm to read listFile
			try {
				//Open file and make scanner
				File listRead = new File(nameAndPath.get(listToRead));
				Scanner readList = new Scanner(listRead);
				while (readList.hasNext()) {
					
					
					
					String question = readList.nextLine();
					
					String answer = readList.nextLine();
					
			        System.out.println(question);
			        
			        
			        
			        
			        System.out.println(answer);
			        
			        questionsOnly.add(question);
			        answersOnly.add(answer);
			        
			        
			        questionAndAnswer.put(question, answer);
			        
			        
				}
				System.out.println(questionAndAnswer);
				readList.close();
				
				
				
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
			
			
			
			System.out.println("Correct list name has been loaded");
			
			
			
			
			
			
			
			
		}
		else {
			System.out.println("WTF BIG ASS ERROR????? HOW DID THIS EVEN HAPPEN!!!!");
		}

	}
	
	
	
	public void onReturnButtonPressed(ActionEvent event) {
		
		
		//Set to default
		shuffled = false;
		currentQuestion = 0;
		questionsCorrect = 0;
		currentQuestionDouble = 0;
		
		//Get stage
		Stage thisStage = (Stage) returnButton.getScene().getWindow();
		//Search lists
		//homeC.checkLists();
		//Change scene to home
		main.changeScene(thisStage, "home.fxml", "QBTS Home");
		
	}
	
	public void onCheckPressed(ActionEvent event) {
		//Make question system here
		int sizeList = questionAndAnswer.size();
		
		
		//Shuffle
		if (shuffled == false) {
			questionProgress.setText(questionsCorrect + "/" + sizeList);
		
		
		
		
			System.out.println(sizeList);
			System.out.println("CEHCK!");
		
		
			checkButton.setText("Check");
		
		
		
		
			Collections.shuffle(questionsOnly);
			
			questionLabel.setText(questionsOnly.get(currentQuestion));
			
			shuffled = true;
		} else {
			progressList.setProgress(0);
			questionProgress.setText(questionsCorrect + "/" + sizeList);
			
			
			
			questionLabel.setText(questionsOnly.get(currentQuestion));
			
			String input = answerTextField.getText();
			
			String answer = questionAndAnswer.get(questionsOnly.get(currentQuestion));
			
			//Answer is correct
			if (input.equals(answer)) {
				System.out.println("CORRECT");
				questionsCorrect++;
				
				progressList.setProgress((currentQuestionDouble + 1.00) / sizeList);
				System.out.println((currentQuestionDouble + 1.00) / sizeList);
			}
			
			//Answer is wrong
			else {
				System.out.println("WRONG");
				System.out.println((currentQuestionDouble + 1.00) / sizeList);
				progressList.setProgress((currentQuestionDouble + 1.00) / sizeList);
			}
			
			if (currentQuestion < sizeList - 1) {
				currentQuestion++;
				currentQuestionDouble += 1.00;
			} else {
				//Finished
			}
			
			questionLabel.setText(questionsOnly.get(currentQuestion));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
