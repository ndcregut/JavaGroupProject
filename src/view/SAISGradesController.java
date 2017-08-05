package view;

import java.util.ArrayList;

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
import saisapp.Grade;
import saisapp.GradeException;
import saisapp.SAIS;
import saisapp.StudentException;


public class SAISGradesController {


	 private SAISMain saisMain;		//may need to change this line 
	 
	 public SAISGradesController(){
		 
	 }
	 
	  
	 public void setSAISMain(SAISMain saisMain){
		 this.saisMain = saisMain;
	 }
	 
	 public static void initialize(){
		 ArrayList <Grade> curGrades = new ArrayList<Grade>();
		 
		 try{
		 curGrades = SAIS.viewCurrentGrades();
		 }
		 catch(GradeException e){
			 System.out.println(e);
		 }
		 //studentIDField.setText(curGrades.get(0).getStudentID());
		 System.out.println(curGrades.get(0).getClassID());
		 
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
