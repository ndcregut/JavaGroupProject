import java.util.ArrayList;
import java.util.Scanner;

public class viewCurrentSchedule{

	public static void main(String[] args) throws Exception{

		//Create new arraylist of Schedule
		ArrayList<Schedule> listOfSchedule = new ArrayList<>();
		
		//data fields for schedule
		int studentID;
		String semester;
		int year;
		int classID;
		String className;
		String days;
		String times;
		String building;
		String room;

		//create new File object for Schedule.txt file
		java.io.File file = new java.io.File("Schedule.txt");

		//create scanner object for Schedule.txt file
		Scanner input = new Scanner(file);

		//loop to read contents of Schedule.txt
		while(input.hasNext()){
			studentID = input.nextInt();
			semester = input.next();
			year = input.nextInt();
			classID = input.nextInt();
			className = input.next();
			days = input.next();
			times = input.next();
			building = input.next();
			room = input.next();

			//Used try-catch blocks to create Schedule instance
			try{
				listOfSchedule.add(new Schedule(studentID, semester, year, classID, className, days, times, building, room));
			}

			//prints exception
			catch(ScheduleException ex){
				System.out.println(ex);
			}
		}
	}
}