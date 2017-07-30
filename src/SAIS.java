import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.io.*;

public class SAIS{
	
	public static StudentLogin studentLogin;
	static {
		try {
			studentLogin = new StudentLogin(0, 0, 0);	
		} catch (Exception SLoginException) {
		}
		
	}

	public static void main(String[] args) throws StudentException, SLoginException, Exception {
								
		// read Student.txt and create ArrayList of Students from the data file
		ArrayList<Student> list = new ArrayList<Student>();
		readStudentFile(list);
		
		// main loop to run the program
		while (studentLogin.getLoggedIn() != 2 ) {
			while (studentLogin.getLoggedIn() == 0)
				TextLoginMenu.textLoginMenu(list);
			TextMainMenu.mainMenu(studentLogin);
			if (studentLogin.getLoggedIn() == 2) {
				studentLogin.setLoggedIn(0);
				studentLogin.setDOB(0);
				studentLogin.setStudentID(0);
			}
			//Run option(s) as selected by user (getCurrentSchedule, viewCurrentGrades, showFinancialStatus, Exit)
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
