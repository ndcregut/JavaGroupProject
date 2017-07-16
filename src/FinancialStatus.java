
public class FinancialStatus {
	private int studentID;
	private float accountBalance;
	private	financialStatus String

	public FinancialStatus(){
		//default construtor
	}

	public FinancialStatus(int studentID, float accountBalance, String financialStatus){
		setStudentID(studentID);
		setAccountBalance(accountBalance);
		setFinancialStatus(financialStatus);
	}


	public void setStudentID(newStudentID){
		studentID = newStudentID;
	}

	public int getStudentID(){
		return this.studentID;
	}

	public void setAccountBalance(newAccountBalance){	
		accountBalance = newAccountBalance;
	}

	public float getAccountBalance(){
		return this.accountBalance;
	}

	public void setFinancialStatus(newFinancialStatus){
		financialStatus = newFinancialStatus;
	}
	
	public String getFinancialStatus(){
		return this.financialStatus;
	}
}
