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

public class SAISLoginController{
 @FXML
 private Label userNameLabel;
 @FXML
 private Label passwordLabel;
 
 @FXML
 private TextField userNameField;
 @FXML
 private TextField passwordField;
 
 private SAISMain saisMain;		//may need to change this line 
 
 public SAISLoginController(){
	 
 }
 
 @FXML
 private void initialize(){
	 userNameField.setText("Enter your student id.");
	 passwordField.setText("Enter your password");
 }
 
 public void setSAISMain(SAISMain saisMain){
	 this.saisMain = saisMain;
 }
 
 @FXML
 private Student handleConfirm() throws StudentException, SLoginException{
	 int userName = Integer.valueOf(userNameField.getText());
	 int password = Integer.valueOf(passwordField.getText());
	 
	 StudentLogin slong = new StudentLogin(userName, password, 0);
	 Student curStudent = new Student();
	 
	 curStudent = SAIS.studentLogin(slong);
	 
	 return curStudent;
	 
	 
 }
 
 /*private void handleConfirm(){
	 confirmLogin();
 }*/
}
