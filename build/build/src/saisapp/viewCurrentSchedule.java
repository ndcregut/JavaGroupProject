package saisapp;
import java.util.ArrayList;
import java.util.Scanner;
//This class was used as part of the testing environment (text based system)
public class viewCurrentSchedule{

	public static void readSchedules(StudentLogin studentLogin) throws Exception{

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
		// find the correct schedule and print it
		Schedule currentSchedule = new Schedule();
		for (int i = 0; i < listOfSchedule.size(); i++) {
			currentSchedule = listOfSchedule.get(i);
			if (studentLogin.getStudentID() == currentSchedule.getStudentID()) {
				System.out.println("");
				System.out.println("StudentID: " + currentSchedule.getStudentID());
				System.out.println("Semester: " + currentSchedule.getSemester());
				System.out.println("Year: " + currentSchedule.getYear());
				System.out.println("ClassID: " + currentSchedule.getClassID());
				System.out.println("Class Name: " + currentSchedule.getClassName());
				System.out.println("Days: " + currentSchedule.getDays());
				System.out.println("Times: " + currentSchedule.getTimes());
				System.out.println("Building: " + currentSchedule.getBuilding());
				System.out.println("Room: " + currentSchedule.getRoom());
			}
		}

		System.out.println("");
		System.out.println("Type 0 to Exit or 1 to return to Main Menu");
		//Create scanner for input
		Scanner temp = new Scanner(System.in);
		//Use try-catch blocks to get selection
		int selection = 0;
		try{
			selection = temp.nextInt();
		}
		//prints exception
		catch(Exception ex){
			System.out.println(ex);		//default exception here, may need to give better explanation or create custom exception
			//we need to reset the student text box here.
		}
		if (selection == 1) {
			studentLogin.setLoggedIn(1);
		}
		else
			studentLogin.setLoggedIn(2);
	}
}