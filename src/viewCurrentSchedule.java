import java.util.ArrayList;
import java.util.Scanner;

public class viewCurrentSchedule{

	public static void readSchedules() throws Exception{

		//Create new arraylist of Schedule
		ArrayList<Schedule> listOfSchedule = new ArrayList<>();
		
		//data fields for schedule
		int studentID;
		String semester;
		int year;
		String classID;
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
			studentID = Integer.parseInt(input.next());
			semester = input.next();
			year = Integer.parseInt(input.next());
			classID = input.next();
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