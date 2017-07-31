package saisapp;

public class FinancialStatus {
	private int studentID;
	private float accountBalance;
	private	String financialStatus;

	public FinancialStatus()throws FinancialException{
		//default constructor
	}

	public FinancialStatus(int studentID, float accountBalance, String financialStatus)throws FinancialException{
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

	public void setAccountBalance(float newAccountBalance)throws FinancialException{	
		accountBalance = newAccountBalance;
	}

	public float getAccountBalance(){
		return this.accountBalance;
	}

	public void setFinancialStatus(String newFinancialStatus)throws FinancialException{
		financialStatus = newFinancialStatus;
	}
	
	public String getFinancialStatus(){
		return this.financialStatus;
	}
}
