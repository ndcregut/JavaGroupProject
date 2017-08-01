package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import saisapp.SAISMain;
import saisapp.StudentLogin;
import saisapp.Student;
import saisapp.SAIS;
import saisapp.SLoginException;
import saisapp.StudentException;
import javafx.scene.paint.Color;

public class SAISLoginController{
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
 
 private SAISMain saisMain;		//may need to change this line 
 
 public SAISLoginController(){
	 
 }
 
 @FXML
 private void initialize(){
	 userNameField.setPromptText("Enter your student id.");
	 passwordField.setPromptText("Enter your password");
	 
 }
 
 public void setSAISMain(SAISMain saisMain){
	 this.saisMain = saisMain;
 }
 
 @FXML
 private void handleConfirm() throws StudentException, SLoginException{
	 int userName = Integer.valueOf(userNameField.getText());
	 int password = Integer.valueOf(passwordField.getText());
	 
	 StudentLogin slong = new StudentLogin(userName, password, 0);
	 int curStudent;
	 
	 curStudent = SAIS.studentLogin(slong);
	 
	 if(curStudent == 0){
		 errorLabel.setTextFill(Color.web("rgb(255,0,0)"));
	 }
	 else{
		 errorLabel.setTextFill(Color.web("rgb(255,255,255)"));
		 //New scene =menu
	 }
	
	 
	 
	 
 }
 
 /*private void handleConfirm(){
	 confirmLogin();
 }*/
}
