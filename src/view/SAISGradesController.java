package view;

import java.util.ArrayList;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import saisapp.SAISMain;
import saisapp.Grade;
import saisapp.GradeException;
import saisapp.SAIS;


public class SAISGradesController {
	//FXML Variables
	@FXML
	 private Label StudentIDLabel;
	@FXML
	 private Label class1;
	@FXML
	 private Label class2;
	@FXML
	 private Label class3;
	@FXML
	 private Label class4;
	@FXML
	 private Label name1;
	@FXML
	 private Label name2;
	@FXML
	 private Label name3;
	@FXML
	 private Label name4;
	@FXML
	 private Label grade1;
	@FXML
	 private Label grade2;
	@FXML
	 private Label grade3;
	@FXML
	 private Label grade4;

	 private SAISMain saisMain; 
	 
	 //Default Constructor
	 public SAISGradesController(){		 
	 }
	 
	 //set saisMain reference 
	 public void setSAISMain(SAISMain saisMain){
		 this.saisMain = saisMain;
	 }
	 
	 //Controller initialize method
	 public void initialize(){
		 //Variables
		 char temp;
		 String grade;
		 
		 //Set array for Student's Grade 
		 ArrayList <Grade> curGrades = new ArrayList<Grade>();
		 
		 //Get Student's Grade information
		 try{
		 curGrades = SAIS.viewCurrentGrades();
		 }
		 catch(GradeException e){
			 System.out.println(e);
		 }
		 
		 //Set fields on form
		 StudentIDLabel.setText(Integer.toString(curGrades.get(0).getStudentID()));
		 class1.setText(curGrades.get(0).getClassID());
		 name1.setText(curGrades.get(0).getClassName());
		 temp = curGrades.get(0).getGrade();
		 grade = Character.toString(temp);
		 grade1.setText(grade);

		 class2.setText(curGrades.get(1).getClassID());
		 name2.setText(curGrades.get(1).getClassName());
		 temp = curGrades.get(1).getGrade();
		 grade = Character.toString(temp);
		 grade2.setText(grade);
		 
		 class3.setText(curGrades.get(2).getClassID());
		 name3.setText(curGrades.get(2).getClassName());
		 temp = curGrades.get(2).getGrade();
		 grade = Character.toString(temp);
		 grade3.setText(grade);

		 class4.setText(curGrades.get(3).getClassID());
		 name4.setText(curGrades.get(3).getClassName());
		 temp = curGrades.get(3).getGrade();
		 grade = Character.toString(temp);
		 grade4.setText(grade);
		 

	 }
	 
	 //Event method to return to main menu
	 @FXML
	 private void handleReturnToMenu(ActionEvent event)throws Exception{
		  Parent curParent =  FXMLLoader.load(getClass().getResource("/view/SAIS_menu.fxml"));
			 Scene curScene = new Scene(curParent);
			 Stage curStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 
			 
			 curStage.setScene(curScene);
			 curStage.show();
			 
	  }
	 
	 //Event method to exit application
	 @FXML
	 private void handleExit(ActionEvent event){
		 Platform.exit();
		 System.exit(0);
	 }

}
