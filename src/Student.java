import java.util.Date;

public class Student {
	private	String fName;
	private	String lName;
	private int studentID;
	private Date DOB;	// I think I have the type right on this.
	char regStatus;		//Shortened this variable name so we have less to type, values here are (E=Enrolled, U=Unerolled, P=Pending)

	public Student()throws StudentException{
		//default constructor
	}


	public Student(String fName, String lName, int studentID, Date DOB, char regStatus)throws StudentException {

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

	public void setDOB(Date newDOB)throws StudentException{
		DOB = newDOB;
	}

	public Date getDOB(){
		return this.DOB;
	}

	public void setRegStatus(char newregStatus)throws StudentException{
		regStatus = newregStatus;
	}

	public char getRegStatus(){
		return this.regStatus;
	}
}
