package saisapp;

public class Class {
	private int classID;
	private String className;
	private String days;
	private String times;
	private String building;
	private String room;
	private int creditHours;

	public Class() throws ClassException{
		//default constructor
	}

	public Class (int classID, String className, String days, String times, String building, String room, int creditHours) throws ClassException{
		setClassID(classID);
		setClassName(className);
		setDays(days);
		setTimes(times);
		setBuilding(building);
		setRoom(room);
		setCreditHours(creditHours);
	}

	public void setClassID(int newClassID) throws ClassException{
		classID = newClassID;
	}
	
	public int getClassID(){	
		return this.classID;
	}	
	
	public void setClassName(String newClassName)throws ClassException{
		className = newClassName;
	}
	
	public String getClassName(){
		return this.className;
	}

	public void setDays(String newDays)throws ClassException{
		days = newDays;
	}

	public String getDays(){
		return this.days;
	}

	public void setTimes(String newTimes)throws ClassException{
		times = newTimes;
	}

	public String getTimes(){
		return this.times;
	}

	public void setBuilding(String newBuilding)throws ClassException{
		building = newBuilding;
	}

	public String getBuilding(){
		return this.building;
	}
	
	public void setRoom(String newRoom)throws ClassException{	
		room = newRoom;
	}

	public String getRoom(){
		return this.room;
	}

	public void setCreditHours(int newCreditHours)throws ClassException{
		creditHours = newCreditHours;
	}

	public int getCreditHours(){	
		return this.creditHours;
	}
}
