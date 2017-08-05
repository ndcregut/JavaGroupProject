package saisapp;

public class Grade {
	private char grade;
	private String classID;
	private String className;
	private int studentID;


	public Grade()throws GradeException{
		//default constructor
	}

	public Grade(int studentID,  String classID, String className, char grade)throws GradeException{
		setStudentID(studentID);
		setClassID(classID);
		setClassName(className);
		setGrade(grade);
	}

	public void setGrade(char newGrade)throws GradeException{
		grade = newGrade;
	}

	public char getGrade(){
		return this.grade;
	}

	public void setClassID(String newClassID)throws GradeException{
		classID = newClassID;
	}

	public String getClassID(){
		return this.classID;
	}

	public void setClassName(String newClassName)throws GradeException{
		className = newClassName;
	}

	public String getClassName(){
		return this.className;
	}

	public void setStudentID(int newStudentID)throws GradeException{
		studentID = newStudentID;
	}

	public int getStudentID(){
		return this.studentID;
	}
}
