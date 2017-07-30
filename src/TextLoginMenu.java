import java.util.Scanner;
import java.util.ArrayList;

public class TextLoginMenu {
	
	public static StudentLogin studentLogin	;	
	public static Student student;
	static {
		try {
			studentLogin = new StudentLogin(0, 0);	
		} catch (Exception SLoginException) {
		}
		try {
			student = new Student();
		} catch (Exception StudentException) {
		}
	}
	
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

		TextLoginMenu.studentLogin.setDOB(DOB);
		TextLoginMenu.studentLogin.setStudentID(studentID);
		for(int i = 0; i < list.size(); i++) {
			student = list.get(i);
			if(student.getDOB() == studentLogin.getDOB() && student.getStudentID() == studentLogin.getStudentID()) {
				System.out.println("Student Logged In.");
				return true;
			}
		}
		/*When you are reading using Scanner from System.in, you should not close any 
		 * Scanner instances because closing one will close System.in and when you do 
		 * the following, NoSuchElementException will be thrown when someone enters
		 * an incorrect login. It does not happen when a correct login is entered.
		 * The Java VM collects the garbage and no memory leak happens.
		 */
	System.out.println("Student Not Found");
	return false;
	}
}