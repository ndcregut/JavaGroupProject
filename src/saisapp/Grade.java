package saisapp;

public class Grade {
	private char grade;
	private String classID;
	private String className;
	private int studentID;


	public Grade()throws GradeException{
		//default constructor
	}

	public Grade(char grade, String classID, String className, int studentID)throws GradeException{
		setGrade(grade);
		setClassID(classID);
		setClassName(className);
		setStudentID(studentID);
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
