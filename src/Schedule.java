
public class Schedule {
	private int studentID;
	private String semester;
	private int year;
	private int classID;
	private String className;
	private String times;
	private String building;
	private String room;
	

	public Schedule()throws ScheduleException{
		//default constructor
	}

	public Schedule(int studentID, String semester, int year, int classID, String className, String times)throws ScheduleException {
		//Added getters and setters data fields in case we need to add exceptions
		setStudentID(studentID);
		setSemester(semester);
		setYear(year);
		setClassID(classID);
		setClassName(className);
		setTimes(times);
		setBuilding(building);
		setRoom(room);
	}

	public void setStudentID(int newStudentID)throws ScheduleException{
		studentID = newStudentID;
	}

	public int getStudentID(){
		return this.studentID;
	}

	public void setSemester(String newSemester)throws ScheduleException{
		semester = newSemester;
	}

	public String getSemester(){
		return this.semester;
	}

	public void setYear(int newYear)throws ScheduleException{
		year = newYear;
	}

	public int getYear(){	
		return this.year;
	}

	public void setClassID(int newClassID)throws ScheduleException{
		classID = newClassID;
	}

	public int getClassID(){
		return this.classID;
	}	
	public void setClassName(String newClassName)throws ScheduleException{
		className = newClassName;
	}

	public String getClassName(){
		return this.className;
	}

	public void setTimes(String newTimes)throws ScheduleException{
		times = newTimes;
	}

	public String getTimes(){
		return this.times;
	}	

	public void setBuilding(String newBuilding)throws ScheduleException{
		building = newBuilding;
	}

	public String getBuilding(){
		return this.building;
	}

	public void setRoom(String newRoom)throws ScheduleException{
		room = newRoom;
	}

	public String getRoom(){
		return this.room;
	}
}
