
public class StudentLogin {
	private int studentID;
	private String DOB;

	public StudentLogin()throws SLoginException{
		//default constructor
	}

	public StudentLogin(int studentID, String DOB)throws SLoginException{	
		setStudentID(studentID);
		setDOB(DOB);
	}

	public void setStudentID(int newStudentID)throws SLoginException{
		studentID = newStudentID;
	}
	
	public int getStudentID(){
		return this.studentID;
	}

	public void setDOB(String newDOB)throws SLoginException{
		DOB = newDOB;
	}

	public String getDOB(){
		return this.DOB;
	}
}
