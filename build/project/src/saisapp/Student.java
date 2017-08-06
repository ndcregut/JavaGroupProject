package saisapp;
import java.util.Date;

public class Student {
	private	String fName;
	private	String lName;
	private int studentID;
	private int DOB;	// mmddyyyy
	char regStatus;		//Shortened this variable name so we have less to type, values here are (E=Enrolled, U=Unenrolled, P=Pending)

	public Student()throws StudentException{
		//default constructor
	}

	//Constructor
	public Student(String fName, String lName, int studentID, int DOB, char regStatus)throws StudentException {

		setFName(fName);
		setLName(lName);
		setStudentID(studentID);
		setDOB(DOB);
		setRegStatus(regStatus);
	}

	//Setter method for first name
	public void setFName(String newfName)throws StudentException{
		fName = newfName;
	}

	//Getter method for first name
	public String getFName(){
		return this.fName;
	}

	//Setter method for last name
	public void setLName(String newlName)throws StudentException{
		lName = newlName;
	}

	//Getter method for last name
	public String getLName(){
		return this.lName;
	}

	//Setter method for Student ID
	public void setStudentID(int newStudentID)throws StudentException{
		studentID = newStudentID;
	}

	//Getter method for Student ID
	public int getStudentID(){
		return this.studentID;
	}

	//Setter method for Date of Birth
	public void setDOB(int newDOB)throws StudentException{
		DOB = newDOB;
	}

	//Getter method for Date of Birth
	public int getDOB(){
		return this.DOB;
	}

	//Setter method for registration status
	public void setRegStatus(char newregStatus)throws StudentException{
		regStatus = newregStatus;
	}

	//Getter method for registration status
	public char getRegStatus(){
		return this.regStatus;
	}
}
