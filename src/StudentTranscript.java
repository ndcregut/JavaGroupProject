
public class StudentTranscript {
	private int studentID;
	private String semester;
	private int year;
	private int classID;
	private String className;
	private char grade;
	
	public StudentTranscript()throws STranscriptException{
		//Default constructor
	}


	public StudentTranscript(int studentID, String semester, int year, int classID, String className, char grade)throws STranscriptException {
		//I removed the this.datafield and added the getter and setters so we can add Exceptions as needed
		setStudentID(studentID);
		setSemester(semester);
		setYear(year);
		setClassID(classID);
		setClassName(className);
		setGrade(grade);
	}

	public void setStudentID(int newStudentID)throws STranscriptException{
		studentID = newStudentID;
	}
	
	public int getStudentID(){
		return this.studentID;
	}

	public void setSemester(String newSemester)throws STranscriptException{
		semester = newSemester;
	}

	public String getSemester(){
		return this.semester;
	}

	public void setYear(int newYear)throws STranscriptException{
		year = newYear;
	}

	public int getYear(){
		return this.year;
	}
	public void setClassID(int newClassID)throws STranscriptException{
		classID = newClassID;
	}
	
	public int getClassID(){
		return this.classID;
	}

	public void setClassName(String newClassName)throws STranscriptException{
		className = newClassName;
	}
	
	public String getClassName(){
		return this.className;
	}

	public void setGrade(char newGrade)throws STranscriptException{	
		grade = newGrade;
	}

	public char getGrade(){
		return this.grade;
	}

	
}
