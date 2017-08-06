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

	//Constructor
	public Class (int classID, String className, String days, String times, String building, String room, int creditHours) throws ClassException{
		setClassID(classID);
		setClassName(className);
		setDays(days);
		setTimes(times);
		setBuilding(building);
		setRoom(room);
		setCreditHours(creditHours);
	}

	//Setter method for class id
	public void setClassID(int newClassID) throws ClassException{
		classID = newClassID;
	}
	
	//Getter method for class id
	public int getClassID(){	
		return this.classID;
	}	
	
	//Setter method for Class Name
	public void setClassName(String newClassName)throws ClassException{
		className = newClassName;
	}
	
	//Getter method for Class Name
	public String getClassName(){
		return this.className;
	}

	//Setter method for days
	public void setDays(String newDays)throws ClassException{
		days = newDays;
	}

	//Getter method for days
	public String getDays(){
		return this.days;
	}

	//Setter method for times
	public void setTimes(String newTimes)throws ClassException{
		times = newTimes;
	}

	//Getter method for times
	public String getTimes(){
		return this.times;
	}

	//Setter method for building
	public void setBuilding(String newBuilding)throws ClassException{
		building = newBuilding;
	}

	//Getter method for building
	public String getBuilding(){
		return this.building;
	}
	
	//Setter method for room
	public void setRoom(String newRoom)throws ClassException{	
		room = newRoom;
	}

	//Getter method for room
	public String getRoom(){
		return this.room;
	}

	//Setter method for Credit hours
	public void setCreditHours(int newCreditHours)throws ClassException{
		creditHours = newCreditHours;
	}

	//Getter method for credit hours
	public int getCreditHours(){	
		return this.creditHours;
	}
}
