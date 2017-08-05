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
import saisapp.FinancialStatus;
import saisapp.FinancialException;
import saisapp.StudentLogin;
import saisapp.Student;
import saisapp.SAIS;
import saisapp.StudentException;


public class SAISFinancialController {


	 private SAISMain saisMain;		//may need to change this line 
	 
	 public SAISFinancialController(){
		 
	 }
	 
	  
	 public void setSAISMain(SAISMain saisMain){
		 this.saisMain = saisMain;
	 }
	 
	 public static void initialize(){
		 ArrayList <FinancialStatus> fStatus = new ArrayList<FinancialStatus>();
		 
		 try{
		 fStatus = SAIS.showFinancialStatus();
		 }
		 catch(FinancialException e){
			 System.out.println(e);
		 }
		 //studentIDField.setText(fStatus.get(0).getStudentID());
		 System.out.println(fStatus.get(0).getAccountBalance());
		 
	 }
	 
	 @FXML
	 private void handleReturnToMenu(ActionEvent event)throws Exception{
		  Parent curParent =  FXMLLoader.load(getClass().getResource("/view/SAIS_menu.fxml"));
			 Scene curScene = new Scene(curParent);
			 Stage curStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			 
			 
			 curStage.setScene(curScene);
			 curStage.show();
			 
			 
	  }
	 private void handleExit(){
		 
	 }

}
