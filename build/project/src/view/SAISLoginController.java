package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import saisapp.SAISMain;
import saisapp.StudentLogin;
import saisapp.SAIS;
import saisapp.SLoginException;
import saisapp.StudentException;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class SAISLoginController{
	
//FXML variable declarations	
 @FXML
 private Label userNameLabel;
 @FXML
 private Label passwordLabel; 
 @FXML
 private TextField userNameField;
 @FXML
 private TextField passwordField;
 @FXML
 private Label errorLabel;
 
private SAISMain saisMain; 

 //Default constructor
 public SAISLoginController(){
	 
 }
 
 //Controller initialize method
 @FXML
 private void initialize(){
	 //set prompt text for username and password text boxes
	 userNameField.setPromptText("Enter your student id.");
	 passwordField.setPromptText("Enter your password");
	 
 }
 
 //Returns reference saisMain
 public void setSAISMain(SAISMain saisMain){
	 this.saisMain = saisMain;
 }
 
 //Event method for confirm button
 @FXML
 private int handleConfirm(ActionEvent event) throws StudentException, SLoginException, Exception{
	 //Get values entered into username and password fields
	 int userName = Integer.valueOf(userNameField.getText());
	 int password = Integer.valueOf(passwordField.getText());
	 
	 //Create new StudentLogin object slong
	 StudentLogin slong = new StudentLogin(userName, password, 0);
	 
	 int curStudent;

	 //Set curStudent value based on successful/unsuccessful login
	 curStudent = (int)SAIS.studentLogin(slong);
	 
	 //Check if curStudent login is valid
	 if(curStudent == 0){
		 //If invalid login, change text color or errorLabel displaying incorrect login text
		 errorLabel.setTextFill(Color.web("rgb(255,0,0)"));
		 return 0;
	 }
	 else{
		 //Otherwise change text color to white and move to menu screen
		 errorLabel.setTextFill(Color.web("rgb(255,255,255)"));
		 //New scene =menu
		 Parent curParent =  FXMLLoader.load(getClass().getResource("/view/SAIS_menu.fxml"));
		 Scene curScene = new Scene(curParent);
		 Stage curStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		 curStage.setScene(curScene);
		 curStage.show();
		 
		 //Returns student id
		 return userName;
	 }
	
	 	 
 }
}
