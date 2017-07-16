
public class StudentTranscript {
	private int studentID;
	private String semester;
	private int year;
	private int classID;
	private String className;
	private char grade;
	
	public StudentTranscript(){
		//Default constructor
	}


	public StudentTranscript(int studentID, String semester, int year, int classID, String className, char grade) {
		//I removed the this.datafield and added the getter and setters so we can add Exceptions as needed
		setStudentID(studentID);
		setSemester(semester);
		setYear(year);
		setClassID(classID);
		setClassName(className);
		setGrade(grade);
	}

	public void setStudentID(String newStudentID){
		studentID = newStudentID;
	}
	
	public String getStudentID(){
		return this.studentID;
	}

	public void setSemester(String newSemester){
		semester = newSemester;
	}

	public String getSemester(){
		return this.semester;
	}

	public void setYear(int newYear){
		year = newYear;
	}

	public int getYear(){
		return this.year;
	}
	public void setClassID(int newClassID){
		classID = newClassID;
	}
	
	public int getClassID(){
		return this.classID;
	}

	public void setClassName(String newClassName){
		className = newClassName;
	}
	
	public String getClassName(){
		return this.className;
	}

	public void setGrade(char newGrade){	
		grade = newGrade;
	}

	public char getGrade(){
		return this.grade;
	}

	
}
