
public class Schedule {
	private int studentID;
	Private String semester;
	private int year;
	private int classID;
	private String className;
	private String times;
	

	public Schedule(){
		//default constructor
	}

	public Schedule(int studentID, String semester, int year, int classID, String className, String times) {
		//Added getters and setters data fields in case we need to add exceptions
		setStudentID(studentID);
		setSemester(semester);
		setYear(year);
		setClassID(classID);
		setClassName(className);
		setTimes(times);
	}

	public void setStudentID(int newStudentID){
		studentID = newStudentID;
	}

	public int getStudentID(){
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

	public void setTimes(String newTimes){
		times = newTimes;
	}

	public String getTimes(){
		return this.times;
	}	
}
