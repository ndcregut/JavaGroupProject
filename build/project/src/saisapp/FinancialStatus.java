package saisapp;

public class FinancialStatus {
	private int studentID;
	private int accountBalance;
	private	String financialStatus;

	public FinancialStatus()throws FinancialException{
		//default constructor
	}

	public FinancialStatus(int studentID, int accountBalance, String financialStatus)throws FinancialException{
		setStudentID(studentID);
		setAccountBalance(accountBalance);
		setFinancialStatus(financialStatus);
	}


	public void setStudentID(int newStudentID)throws FinancialException{
		studentID = newStudentID;
	}

	public int getStudentID(){
		return this.studentID;
	}

	public void setAccountBalance(int newAccountBalance)throws FinancialException{	
		accountBalance = newAccountBalance;
	}

	public int getAccountBalance(){
		return this.accountBalance;
	}

	public void setFinancialStatus(String newFinancialStatus)throws FinancialException{
		financialStatus = newFinancialStatus;
	}
	
	public String getFinancialStatus(){
		return this.financialStatus;
	}
}
