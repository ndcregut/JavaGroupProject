
public class Student {
	String fName;
	String lName;
	int studentID;
	// String DOB; Don't know what data type you want for this
	char registrationStatus;
	public Student(String fName, String lName, int studentID, //String DOB
			char registrationStatus) {
		this.fName = fName;
		this.lName = lName;
		this.studentID = studentID;
		//this.DOB = DOB
		this.registrationStatus = registrationStatus;
	}
}
