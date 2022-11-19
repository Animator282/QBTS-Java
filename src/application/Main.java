package application;

import java.io.File;
import java.io.IOException;

import java.util.HashMap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class Main extends Application {
	
	public Scene scene, scene2;
	
    @Override
    public void start(Stage stage) throws Exception {
    	
		new File(System.getProperty("user.dir") + "/saves/").mkdirs();
    	
    	homeController homeControl = new homeController();
    	
    	stage.setTitle("QBTS");
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene scene = new Scene(root);
        
        
        
        stage.setScene(scene);
        stage.show();
       
    }
    
    public void changeScene(Stage stage, String FXMLFile) {
    	Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource(FXMLFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	Scene sceneChange = new Scene(root);
    	stage.setScene(sceneChange);
    }
    
    
    
    
    public static void main(String[] args) {
        launch(args);
    }


}