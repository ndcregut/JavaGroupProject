
public class StudentLogin {
	private int studentID;
	private int DOB;

	public StudentLogin()throws SLoginException{
		//default constructor
	}

	public StudentLogin(int studentID, int DOB)throws SLoginException{	
		setStudentID(studentID);
		setDOB(DOB);
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
}
