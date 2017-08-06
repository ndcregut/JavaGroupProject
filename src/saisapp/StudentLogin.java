package saisapp;

public class StudentLogin {
	private int studentID;
	private int DOB;
	private int loggedIn;

	public StudentLogin() throws SLoginException{
		//default constructor
	}

	//Constructor
	public StudentLogin(int studentID, int DOB, int loggedIn)throws SLoginException{	
		setStudentID(studentID);
		setDOB(DOB);
		setLoggedIn(loggedIn); // 0 = not logged in, 1 = logged in (return to main menu), 2 = go to log out (exit)
	}

	//Setter method for Student ID
	public void setStudentID(int newStudentID)throws SLoginException{
		studentID = newStudentID;
	}

	//Getter method for Student ID
	public int getStudentID(){
		return this.studentID;
	}

	//Setter method for Date of Birth
	public void setDOB(int newDOB)throws SLoginException{
		DOB = newDOB;
	}

	//Getter method for Date of Birth
	public int getDOB(){
		return this.DOB;
	}
	
	//Setter method for Logged in
	public void setLoggedIn(int newLoggedIn)throws SLoginException{
		loggedIn = newLoggedIn;
	}

	//Getter method for Logged in
	public int getLoggedIn(){
		return this.loggedIn;
	}	
}
