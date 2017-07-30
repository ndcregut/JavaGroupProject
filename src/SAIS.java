import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.io.*;

public class SAIS{

	public static void main(String[] args) throws StudentException, SLoginException {
		
		boolean login = false; // turns true once a student logs in
											// and false once a student logs out
		boolean exit = false; // while false the program will continue looping
								// when true the program will exit
								
		// read Student.txt and create ArrayList of Students from the data file
		ArrayList<Student> list = new ArrayList<Student>();
		readStudentFile(list);
		
		// main loop to run the program
		while (exit == false) {
			while (login == false) {
				login = TextLoginMenu.textLoginMenu(list);
			}
			//Create main menu with options
			//Run option(s) as selected by user (getCurrentSchedule, viewCurrentGrades, showFinancialStatus, Exit)
			exit = true; // temporary line until the above is written
		}
			
	}
	
	public static void readStudentFile(ArrayList<Student> list) throws StudentException {
		String fName;
		String lName;
		int studentID;
		int DOB;
		char regStatus;
		String temp = "";
		
	Scanner input = null;
    try
    {
      input = new Scanner(new File("Student.txt"));
    }
    catch(FileNotFoundException s)
    {
      System.out.println("File does Not Exist Please Try Again: ");
    }

		while (input.hasNext()) {
			fName = input.next();
			lName = input.next();
			studentID = Integer.parseInt(input.next());
			DOB = input.nextInt();
			temp = input.next();
			regStatus = temp.charAt(0);
			list.add(new Student(fName, lName, studentID, DOB, regStatus));
		}
		input.close();
	}
}
