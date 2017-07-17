
public class Class {
	private int classID;
	private String className;
	private String days;
	private String times;
	private String building;
	private String room;
	private int creditHours;

	public Class(){
		//default constructor
	}

	public Class(int classID, String className, String days, String times, String building, String room, int creditHours){
		setClassID(classID);
		setClassName(className);
		setDays(days);
		setTimes(times);
		setBuilding(building);
		setRoom(room);
		setCreditHours(creditHours);
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

	public void setDays(String newDays){
		days = newDays;
	}

	public String getDays(){
		return this.days;
	}

	public void setTimes(String newTimes){
		times = newTimes;
	}

	public String getTimes(){
		return this.times;
	}

	public void setBuilding(String newBuilding){
		building = newBuilding;
	}

	public String getBuilding(){
		return this.building;
	}
	
	public void setRoom(String newRoom){	
		room = newRoom;
	}

	public String getRoom(){
		return this.room;
	}

	public void setCreditHours(int newCreditHours){
		creditHours = newCreditHours;
	}

	public int getCreditHours(){	
		return this.creditHours;
	}
}
