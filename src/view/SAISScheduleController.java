package view;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import saisapp.SAISMain;
import saisapp.Schedule;
import saisapp.SAIS;
import saisapp.ScheduleException;

import java.util.ArrayList;


public class SAISScheduleController {
//FXML variables
@FXML
private AnchorPane anchorPane;
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
private Label day1;
@FXML
private Label day2;
@FXML
private Label day3;
@FXML
private Label day4;
@FXML
private Label time1;
@FXML
private Label time2;
@FXML
private Label time3;
@FXML
private Label time4;
@FXML
private Label building1;
@FXML
private Label building2;
@FXML
private Label building3;
@FXML
private Label building4;
@FXML
private Label room1;
@FXML
private Label room2;
@FXML
private Label room3;
@FXML
private Label room4;
@FXML
private Label semester;
@FXML
private Label year;

	 private SAISMain saisMain; 
	 
	 
	 public SAISScheduleController(){
		 //default constructor
	 }
	 
	 //Set saisMain method 
	 public void setSAISMain(SAISMain saisMain){
		 this.saisMain = saisMain;
	 }
	 
	 
	 //Controller initialize method
	 public void initialize(){		 
		 
		//ArrayList for student's schedule 
		ArrayList <Schedule> curSchedule = new ArrayList<Schedule>();
		 
		//Retrieve student's schedule information
		 try{
		 curSchedule = SAIS.viewCurrentSchedule();
		 }
		 catch(ScheduleException e){
			 System.out.println(e);
		 }
		 
		 //Set form fields
		 StudentIDLabel.setText(Integer.toString(curSchedule.get(0).getStudentID()));
		 semester.setText(curSchedule.get(0).getSemester());
		 year.setText(Integer.toString(curSchedule.get(0).getYear()));
		 class1.setText(curSchedule.get(0).getClassID());
		 name1.setText(curSchedule.get(0).getClassName());
		 day1.setText(curSchedule.get(0).getDays());
		 time1.setText(curSchedule.get(0).getTimes());
		 building1.setText(curSchedule.get(0).getBuilding());
		 room1.setText(curSchedule.get(0).getRoom());
		 
		 class2.setText(curSchedule.get(1).getClassID());
		 name2.setText(curSchedule.get(1).getClassName());
		 day2.setText(curSchedule.get(1).getDays());
		 time2.setText(curSchedule.get(1).getTimes());
		 building2.setText(curSchedule.get(1).getBuilding());
		 room2.setText(curSchedule.get(1).getRoom());
		 
		 class3.setText(curSchedule.get(2).getClassID());
		 name3.setText(curSchedule.get(2).getClassName());
		 day3.setText(curSchedule.get(2).getDays());
		 time3.setText(curSchedule.get(2).getTimes());
		 building3.setText(curSchedule.get(2).getBuilding());
		 room3.setText(curSchedule.get(2).getRoom());
		 
		 class4.setText(curSchedule.get(3).getClassID());
		 name4.setText(curSchedule.get(3).getClassName());
		 day4.setText(curSchedule.get(3).getDays());
		 time4.setText(curSchedule.get(3).getTimes());
		 building4.setText(curSchedule.get(3).getBuilding());
		 room4.setText(curSchedule.get(3).getRoom());

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
	 private void handleExit(){
		 Platform.exit();
		 System.exit(0);
	 }

}
