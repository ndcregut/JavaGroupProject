
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
		return this.ClassName;
	}

	public void setDays(newDays){
		days = newDays;
	}

	public String getDays(){
		return this.days;
	}

	public void setTimes(newTimes){
		times = newTimes;
	}

	public String getTimes(){
		return this.times;
	}

	public void setBuilding(newBuilding){
		building = newBuilding;
	}

	public String getBuilding(){
		return this.building;
	}
	
	public void setRoom(newRoom){	
		room = newRoom;
	}

	public String getRoom(){
		return this.room;
	}

	public void setCreditHours(newCreditHours){
		creditHours = newCreditHours;
	}

	public int getCreditHours(){	
		return this.creditHours;
	}
}
