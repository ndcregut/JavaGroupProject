package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import saisapp.SAISMain;
import saisapp.StudentLogin;
import saisapp.Student;
import saisapp.SAIS;
import saisapp.StudentException;
import view.SAISScheduleController;
import java.util.ArrayList;


public class SAISMenuController {


	 private SAISMain saisMain;		//may need to change this line 
	 
	 public SAISMenuController(){
		 
	 }
	 
	 public void setSAISMain(SAISMain saisMain){
		 this.saisMain = saisMain;
	 }
	 
	 public static void intialize(){
		 //studentID=newID;
	 }
	 
	 
	 @FXML
	 private void handleGrades(ActionEvent event)throws Exception{		 
		 Parent curParent =  FXMLLoader.load(getClass().getResource("/view/SAIS_grades.fxml"));
		 Scene curScene = new Scene(curParent);
		 Stage curStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		 
		 
		 curStage.setScene(curScene);
		 curStage.show();
		 
		 
	 }
	 @FXML
	 private void handleSchedule(ActionEvent event)throws Exception{
		 Parent curParent =  FXMLLoader.load(getClass().getResource("/view/SAIS_schedule.fxml"));
		 Scene curScene = new Scene(curParent);
		 Stage curStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		 
		 curStage.setScene(curScene);
		 
		 curStage.show();
		 
		 
		 
	 }
	 @FXML
	 private void handleFinancial(ActionEvent event)throws Exception{
		 Parent curParent =  FXMLLoader.load(getClass().getResource("/view/SAIS_financial.fxml"));
		 Scene curScene = new Scene(curParent);
		 Stage curStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		 
		 
		 curStage.setScene(curScene);
		 
		 curStage.show();
		 
	
	}
	@FXML 
	private void handleExit(){
		 
	 }

}
