package saisapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import saisapp.SAISMain;
import saisapp.StudentLogin;
import saisapp.Student;
import saisapp.SAIS;
import saisapp.SLoginException;
import saisapp.StudentException;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
private Stage primaryStage;
private BorderPane rootLayout;
 
 
 
 public SAISLoginController(){
	 
 }
 
 @FXML
 private void initialize(){
	 userNameField.setPromptText("Enter your student id.");
	 passwordField.setPromptText("Enter your password");
	 
 }
/* 
 public void setSAISMain(SAISMain saisMain){
	 this.saisMain = saisMain;
 }*/
 
 @FXML
 private int handleConfirm(ActionEvent event) throws StudentException, SLoginException, Exception{
	 int userName = Integer.valueOf(userNameField.getText());
	 int password = Integer.valueOf(passwordField.getText());
	 
	 StudentLogin slong = new StudentLogin(userName, password, 0);
	 int curStudent;
	 
	 curStudent = (int)SAIS.studentLogin(slong);
	 
	 if(curStudent == 0){
		 errorLabel.setTextFill(Color.web("rgb(255,0,0)"));
		 return 0;
	 }
	 else{
		 errorLabel.setTextFill(Color.web("rgb(255,255,255)"));
		 //New scene =menu
		 Parent curParent =  FXMLLoader.load(getClass().getResource("SAIS_menu.fxml"));
		 Scene curScene = new Scene(curParent);
		 Stage curStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		 
		 
		 curStage.setScene(curScene);
		 curStage.show();
		 
		 SAISMenuController.intialize(curStudent);
		 return curStudent;
	 }
	
	 	 
 }
}
