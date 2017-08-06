package view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import saisapp.SAISMain;


public class SAISMenuController {


	 private SAISMain saisMain;		 
	 
	 //Default constructor
	 public SAISMenuController(){
		 
	 }
	 
	 //Set reference 
	 public void setSAISMain(SAISMain saisMain){
		 this.saisMain = saisMain;
	 }
	 
	 //initializing function
	 public static void initialize(){
		 //stub 
	 }
	 
	 
	 //Event method for handing Grade button
	 @FXML
	 private void handleGrades(ActionEvent event)throws Exception{	
		 //Variables
		 Stage stage;
		 Parent root;
		 
		 //Set stage from current stage location
		 stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		 //Create loader object 
		 FXMLLoader loader = new FXMLLoader();
		 //Set location of scene to be loaded
		 loader.setLocation(getClass().getResource("/view/SAIS_grades.fxml"));

		 //Set root to loader.load
		 root = loader.load();  
		 
		 //Create new scene object based on root
		 Scene scene = new Scene(root);
		 
		 //Set Scene to scene
		 stage.setScene(scene);
		 //Show new stage
		 stage.show();
		 
	 }
	 //Event method handling for Schedule button
	 @FXML
	 private void handleSchedule(ActionEvent event)throws Exception{
		 //Variables
		 Stage stage;
		 Parent root;
		 
		 //Set stage from current stage location
		 stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		 //Create loader object
		 FXMLLoader loader = new FXMLLoader();
		 //Set location of scene to be loaded
		 loader.setLocation(getClass().getResource("/view/SAIS_schedule.fxml"));
		 //Set root to loader.load
		 root = loader.load();  
		 
		 //Create new scene object based on root
		 Scene scene = new Scene(root);
		 
		 //Set Scene to scene
		 stage.setScene(scene);

		 //Show new stage
		 stage.show();
	
		 
	 }

	 //Event method handling Financial Button 
	 @FXML
	 private void handleFinancial(ActionEvent event)throws Exception{
		 //Set parent to Loader.load and set location of scene to be loaded
		 Parent curParent =  FXMLLoader.load(getClass().getResource("/view/SAIS_financial.fxml"));
		 //Set new curScene to cur Parent
		 Scene curScene = new Scene(curParent);
		 //Set new curStage
		 Stage curStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		 
		 //Set Scene to curScene
		 curStage.setScene(curScene);
		 //Show new Stage
		 curStage.show();
		 
	
	}
	 
	 //Event method for handling Exit Button
	@FXML 
	private void handleExit(){
		Platform.exit();
		 System.exit(0); 
	 }

}
