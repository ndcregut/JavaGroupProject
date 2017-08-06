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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import saisapp.SAISMain;
import saisapp.FinancialStatus;
import saisapp.FinancialException;
import saisapp.StudentLogin;
import saisapp.Student;
import saisapp.SAIS;
import saisapp.StudentException;


public class SAISFinancialController {

	@FXML
	 private Label StudentIDLabel;
	@FXML
	 private Label balance;
	@FXML
	 private Label status;
	@FXML

	 private SAISMain saisMain;		//may need to change this line 
	 
	 public SAISFinancialController(){
		 
	 }
	 
	  
	 public void setSAISMain(SAISMain saisMain){
		 this.saisMain = saisMain;
	 }
	 
	 public void initialize(){
		 ArrayList <FinancialStatus> fStatus = new ArrayList<FinancialStatus>();
		 
		 try{
		 fStatus = SAIS.showFinancialStatus();
		 }
		 catch(FinancialException e){
			 System.out.println(e);
		 }

		 StudentIDLabel.setText(Integer.toString(fStatus.get(0).getStudentID()));
		 balance.setText("$" + Integer.toString(fStatus.get(0).getAccountBalance()) + ".00");
		 status.setText(fStatus.get(0).getFinancialStatus());
		 
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
	 private void handleExit(ActionEvent event){
		 Platform.exit();
		 System.exit(0);
		 
	 }

}
