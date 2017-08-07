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
import saisapp.FinancialStatus;
import saisapp.FinancialException;
import saisapp.SAIS;


public class SAISFinancialController {
//FXML variables
	@FXML
	 private Label StudentIDLabel;
	@FXML
	 private Label balance;
	@FXML
	 private Label status;
	@FXML

	 private SAISMain saisMain;		 

	//Default constructor
	 public SAISFinancialController(){
		 
	 }
	 
	 //Set reference for saisMain 
	 public void setSAISMain(SAISMain saisMain){
		 this.saisMain = saisMain;
	 }
	 
	 //Controller initialize method
	 public void initialize(){
		 //Create new ArrayList object fStatus
		 ArrayList <FinancialStatus> fStatus = new ArrayList<FinancialStatus>();
		 
		 //Get student's financial status information
		 try{
		 fStatus = SAIS.showFinancialStatus();
		 }
		 catch(FinancialException e){
			 System.out.println(e);
		 }

		 //Set fields on form
		 StudentIDLabel.setText(Integer.toString(fStatus.get(0).getStudentID()));
		 balance.setText("$" + Integer.toString(fStatus.get(0).getAccountBalance()) + ".00");
		 status.setText(fStatus.get(0).getFinancialStatus());
		 
	 }
	 
	 //Event method for Return to Menu
	 @FXML
	 private void handleReturnToMenu(ActionEvent event)throws Exception{
		Parent curParent =  FXMLLoader.load(getClass().getResource("/view/SAIS_menu.fxml"));
		Scene curScene = new Scene(curParent);
		Stage curStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 
			 
			 curStage.setScene(curScene);
			 curStage.show();
			 
			 
	  }
	 
	 //event method for exiting application
	 @FXML
	 private void handleExit(ActionEvent event){
		 Platform.exit();
		 System.exit(0);
	 }
}
