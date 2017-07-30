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


	public Student(String fName, String lName, int studentID, int DOB, char regStatus)throws StudentException {

		setFName(fName);
		setLName(lName);
		setStudentID(studentID);
		setDOB(DOB);
		setRegStatus(regStatus);
	}

	public void setFName(String newfName)throws StudentException{
		fName = newfName;
	}

	public String getFName(){
		return this.fName;
	}

	public void setLName(String newlName)throws StudentException{
		lName = newlName;
	}

	public String getLName(){
		return this.lName;
	}

	public void setStudentID(int newStudentID)throws StudentException{
		studentID = newStudentID;
	}

	public int getStudentID(){
		return this.studentID;
	}

	public void setDOB(int newDOB)throws StudentException{
		DOB = newDOB;
	}

	public int getDOB(){
		return this.DOB;
	}

	public void setRegStatus(char newregStatus)throws StudentException{
		regStatus = newregStatus;
	}

	public char getRegStatus(){
		return this.regStatus;
	}
}
