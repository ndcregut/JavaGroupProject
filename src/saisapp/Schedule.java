package saisapp;

public class Schedule {
	private int studentID;
	private String semester;
	private int year;
	private String classID;
	private String className;
	private String days;
	private String times;
	private String building;
	private String room;
	

	public Schedule()throws ScheduleException{
		//default constructor
	}

	//Constructor
	public Schedule(int studentID, String semester, int year, String classID, String className, String days, String times, String building, String room)throws ScheduleException {
		//Added getters and setters data fields in case we need to add exceptions
		setStudentID(studentID);
		setSemester(semester);
		setYear(year);
		setClassID(classID);
		setClassName(className);
		setDays(days);
		setTimes(times);
		setBuilding(building);
		setRoom(room);
	}

	//Setter method for Student ID
	public void setStudentID(int newStudentID)throws ScheduleException{
		studentID = newStudentID;
	}

	//Getter method for Student ID
	public int getStudentID(){
		return this.studentID;
	}

	//Setter method for Semester
	public void setSemester(String newSemester)throws ScheduleException{
		semester = newSemester;
	}

	//Getter method for Semester
	public String getSemester(){
		return this.semester;
	}

	//Setter method for Year
	public void setYear(int newYear)throws ScheduleException{
		year = newYear;
	}

	//Getter method for Year
	public int getYear(){	
		return this.year;
	}

	//Setter method for Class ID
	public void setClassID(String newClassID)throws ScheduleException{
		classID = newClassID;
	}

	//Getter method for Class ID
	public String getClassID(){
		return this.classID;
	}	
	
	//Setter method for Class Name
	public void setClassName(String newClassName)throws ScheduleException{
		className = newClassName;
	}

	//Getter method for Class Name
	public String getClassName(){
		return this.className;
	}

	//Setter method for days
	public void setDays(String newDays)throws ScheduleException{
		days = newDays;
	}

	//Getter method for days
	public String getDays(){
		return this.days;
	}

	//Setter method for times
	public void setTimes(String newTimes)throws ScheduleException{
		times = newTimes;
	}

	//Getter method for times
	public String getTimes(){
		return this.times;
	}	

	//Setter method for building
	public void setBuilding(String newBuilding)throws ScheduleException{
		building = newBuilding;
	}
	
	//Getter method for building
	public String getBuilding(){
		return this.building;
	}

	//Setter method for Room
	public void setRoom(String newRoom)throws ScheduleException{
		room = newRoom;
	}

	//Getter method for Room
	public String getRoom(){
		return this.room;
	}
}
