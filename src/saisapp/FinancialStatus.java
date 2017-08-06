package saisapp;

public class FinancialStatus {
	private int studentID;
	private float accountBalance;
	private	String financialStatus;

	public FinancialStatus()throws FinancialException{
		//default constructor
	}

	//Constructor
	public FinancialStatus(int studentID, float accountBalance, String financialStatus)throws FinancialException{
		setStudentID(studentID);
		setAccountBalance(accountBalance);
		setFinancialStatus(financialStatus);
	}

	//Setter method for Student ID
	public void setStudentID(int newStudentID)throws FinancialException{
		studentID = newStudentID;
	}

	//Getter method for Student ID
	public int getStudentID(){
		return this.studentID;
	}

	//Setter method for Account Balance
	public void setAccountBalance(float newAccountBalance)throws FinancialException{	
		accountBalance = newAccountBalance;
	}

	//Getter method for Account Balance
	public float getAccountBalance(){
		return this.accountBalance;
	}

	//Setter method for Financial Status
	public void setFinancialStatus(String newFinancialStatus)throws FinancialException{
		financialStatus = newFinancialStatus;
	}
	
	//Getter method for Financial Status
	public String getFinancialStatus(){
		return this.financialStatus;
	}
}
