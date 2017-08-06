package saisapp;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.Parent;
import view.SAISLoginController;
import view.SAISMenuController;

public class SAISMain extends Application {

		private Stage primaryStage;
		private BorderPane rootLayout;

	//Loads primary Stage for application	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Student Admissions Information System");
		
		//Sets root layout to Root_Layout.fxml file
		initRootLayout();
		
		//Sets SAIS login screen
		initSAISLogin();
	}

	//Method to set root_layout.fxml file
	public void initRootLayout(){
		try{
			//Load Root layout from fxml file
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(SAISMain.class.getResource("/view/Root_layout.fxml"));
			rootLayout=(BorderPane) loader.load();
			
			//show scene containing the root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void initSAISLogin(){
		try{
			//Load SAIS_login Screen
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(SAISMain.class.getResource("/view/SAIS_login.fxml"));
			AnchorPane saisLayout = (AnchorPane) loader.load();		
			
			//Set SAIS_login into center of Root_layout
			rootLayout.setCenter(saisLayout);
			
			//Set controller for Login screen
			SAISLoginController controller = loader.getController();
			controller.setSAISMain(this);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Stage getPrimaryStage(){
		return primaryStage;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
