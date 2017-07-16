
public class StudentLogin {
	private int studentID;
	private String DOB;

	public StudentLogin(){
		//default constructor
	}

	public StudentLogin(int studentID, String DOB){	
		setStudentID(studentID);
		setDOB(DOB);
	}

	public void setStudentID(newStudentID){
		studentID = newStudentID;
	}
	
	public int getStudentID(){
		return this.studentID;
	}

	public void setDOB(newDOB){
		DOB = newDOB;
	}

	public String getDOB(){
		return this.DOB;
	}
}
