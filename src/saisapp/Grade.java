package saisapp;

public class Grade {
	private char grade;
	private String classID;
	private String className;
	private int studentID;


	public Grade()throws GradeException{
		//default constructor
	}

	//Constructor
	public Grade(int studentID,  String classID, String className, char grade)throws GradeException{
		setStudentID(studentID);
		setClassID(classID);
		setClassName(className);
		setGrade(grade);
	}

	//Setter method for Grade
	public void setGrade(char newGrade)throws GradeException{
		grade = newGrade;
	}

	//Getter method for Grade
	public char getGrade(){
		return this.grade;
	}

	//Setter method for Class ID
	public void setClassID(String newClassID)throws GradeException{
		classID = newClassID;
	}
	
	//Getter method for class ID
	public String getClassID(){
		return this.classID;
	}

	//Setter method for Class Name
	public void setClassName(String newClassName)throws GradeException{
		className = newClassName;
	}

	//Getter method for Class Name
	public String getClassName(){
		return this.className;
	}

	//Setter method for Student ID
	public void setStudentID(int newStudentID)throws GradeException{
		studentID = newStudentID;
	}

	//Getter method for Student ID
	public int getStudentID(){
		return this.studentID;
	}
}
