package saisapp;

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

	//Constructor
	public StudentTranscript(int studentID, String semester, int year, int classID, String className, char grade)throws STranscriptException {
		//I removed the this.datafield and added the getter and setters so we can add Exceptions as needed
		setStudentID(studentID);
		setSemester(semester);
		setYear(year);
		setClassID(classID);
		setClassName(className);
		setGrade(grade);
	}

	//Setter method for Student ID
	public void setStudentID(int newStudentID)throws STranscriptException{
		studentID = newStudentID;
	}
	
	//Getter method for Student ID
	public int getStudentID(){
		return this.studentID;
	}

	//Setter method for Semester
	public void setSemester(String newSemester)throws STranscriptException{
		semester = newSemester;
	}

	//Getter method for Semester
	public String getSemester(){
		return this.semester;
	}

	//Setter method for Year
	public void setYear(int newYear)throws STranscriptException{
		year = newYear;
	}

	//Getter method for Year
	public int getYear(){
		return this.year;
	}
	
	//Setter method for Class ID
	public void setClassID(int newClassID)throws STranscriptException{
		classID = newClassID;
	}
	
	//Getter method for Class ID
	public int getClassID(){
		return this.classID;
	}

	//Setter method for Class Name
	public void setClassName(String newClassName)throws STranscriptException{
		className = newClassName;
	}
	
	//Getter method for Class Name
	public String getClassName(){
		return this.className;
	}

	//Setter method for Grade
	public void setGrade(char newGrade)throws STranscriptException{	
		grade = newGrade;
	}

	//Getter method for Grade
	public char getGrade(){
		return this.grade;
	}	
}
