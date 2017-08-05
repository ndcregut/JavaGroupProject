package view;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
//import javafx.scene.layout.GridPane;
import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import saisapp.SAISMain;
import saisapp.Schedule;
import saisapp.Student;
import saisapp.StudentLogin;
import saisapp.SAIS;
import saisapp.ScheduleException;

import java.io.IOException;
import java.util.ArrayList;


public class SAISScheduleController {

@FXML
private AnchorPane anchorPane;
@FXML
private TextField studentIDField;

	 //private SAISMain saisMain;		//may need to change this line 
	 
	 public SAISScheduleController(){
		 //default constructor
	 }
	 
	 
	@FXML
	  
	/* public void setSAISMain(SAISMain saisMain){
		 this.saisMain = saisMain;
	 }*/
	 
	 public void initialize(){		 
		 
		ArrayList <Schedule> curSchedule = new ArrayList<Schedule>();
		 
		 try{
		 curSchedule = SAIS.viewCurrentSchedule();
		 }
		 catch(ScheduleException e){
			 System.out.println(e);
		 }
		 //studentIDField.setText(curSchedule.get(0).getStudentID());
		 System.out.println(curSchedule.get(0).getClassName());
		  

	 }
	 
	
	
	 @FXML
	 private void handleReturnToMenu(ActionEvent event)throws Exception{
		  Parent curParent =  FXMLLoader.load(getClass().getResource("/view/SAIS_menu.fxml"));
			 Scene curScene = new Scene(curParent);
			 Stage curStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 
			 
			 curStage.setScene(curScene);
			 curStage.show();
	
	  }
	 
	 @FXML
	 private void handleExit(){
		 
	 }

}
