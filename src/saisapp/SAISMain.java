package saisapp;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;	//do we need this?
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import view.SAISLoginController;
import view.SAISMenuController;

public class SAISMain extends Application {

		private Stage primaryStage;
		private BorderPane rootLayout;
		
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Student Admissions Information System");
		
		initRootLayout();
		
		initSAISLogin();
	}

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
			AnchorPane saisLayout = (AnchorPane) loader.load();		//may have to change this line
			
			//Set SAIS_login into center of Root_layout
			rootLayout.setCenter(saisLayout);
			
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
