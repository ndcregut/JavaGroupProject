import java.util.Scanner;
import java.util.ArrayList;

public class TextLoginMenu {

	public static boolean textLoginMenu(ArrayList<Student> list) throws StudentException, SLoginException {
		int studentID = 0;
		int DOB = 0;
		//Create scanner for input
		Scanner input = new Scanner(System.in);

		//Get student id from student
		System.out.println("Please enter your student ID (numbers only): ");
	
		//Use try-catch blocks to create student id
		try{
			studentID = input.nextInt();
		}	
		
		//prints exception
		catch(Exception ex){
			System.out.println(ex);		//default exception here, may need to give better explanation or create custom exception
			//we need to reset the student text box here.
		}

		//Get DOB from student
		System.out.println("Please enter your DOB (mmddyyyy): ");
		try{		
			DOB = input.nextInt();
		}

		//prints exception
		catch(Exception ex){
			System.out.println(ex);		//default exception here, may need to give better explanation or create custom exception
			//we need to reset the DOB text box here.
		}

		StudentLogin studentLogin = new StudentLogin(studentID, DOB);		
		Student student = new Student();
		for(int i = 0; i < list.size(); i++) {
			student = list.get(i);
			int stuID = student.getStudentID();
			int stuDOB = student.getDOB();
			if(stuDOB == DOB) {
				System.out.println("Student Logged In.");
				input.close();
				return true;
			}
		}
		
		//Close login menu with successful login (maintain student id object)
	input.close();
	System.out.println("Student Not Found");
	return false;
	}
}