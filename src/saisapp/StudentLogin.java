package saisapp;

public class StudentLogin {
	private int studentID;
	private int DOB;
	private int loggedIn;

	public StudentLogin() throws SLoginException{
		//default constructor
	}

	public StudentLogin(int studentID, int DOB, int loggedIn)throws SLoginException{	
		setStudentID(studentID);
		setDOB(DOB);
		setLoggedIn(loggedIn); // 0 = not logged in, 1 = logged in (return to main menu), 2 = go to log out (exit)
	}

	public void setStudentID(int newStudentID)throws SLoginException{
		studentID = newStudentID;
	}
	
	public int getStudentID(){
		return this.studentID;
	}

	public void setDOB(int newDOB)throws SLoginException{
		DOB = newDOB;
	}

	public int getDOB(){
		return this.DOB;
	}
	
	public void setLoggedIn(int newLoggedIn)throws SLoginException{
		loggedIn = newLoggedIn;
	}

	public int getLoggedIn(){
		return this.loggedIn;
	}
	
	
}
