
public class Grade {
	private char grade;
	private int classID;
	private String className;


	public Grade(){
		//default constructor
	}

	public Grade(char grade, int classID, String className){
		setGrade(grade);
		setClassID(classID);
		setClassName(className);
	}

	public void setGrade(newGrade){
		grade = newGrade;
	}

	public char getGrade(){
		return this.grade;
	}

	public void setClassID(newClassID){
		classID = newClassID;
	}

	public int getClassID(){
		return this.classID;
	}

	public void setClassName(newClassName){
		className = newClassName;
	}

	public String getClassName(){
		return this.className;
	}

}
