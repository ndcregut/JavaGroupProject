import java.util.Scanner;
import java.util.ArrayList;

public class TextLoginMenu {	
	
	public static Student student;
	static {
		try {
			student = new Student();
		} catch (Exception StudentException) {
		}
	}
	
	public static void textLoginMenu(ArrayList<Student> list) throws StudentException, SLoginException {
		int studentID = 0;
		int DOB = 0;
		//Create scanner for input
		Scanner input = new Scanner(System.in);

		//Get student id from student
		System.out.println("Please enter your student ID (numbers only or enter 9 to exit): ");
	
		//Use try-catch blocks to create student id
		try{
				studentID = input.nextInt();
				if (studentID == 9)
					System.exit(0);
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

		SAIS.studentLogin.setDOB(DOB);
		SAIS.studentLogin.setStudentID(studentID);
		for(int i = 0; i < list.size(); i++) {
			student = list.get(i);
			if(student.getDOB() == SAIS.studentLogin.getDOB() && student.getStudentID() == SAIS.studentLogin.getStudentID()) {
				System.out.println("Student Logged In.");
				SAIS.studentLogin.setLoggedIn(1);
				return;
			}
		}
		/*When you are reading using Scanner from System.in, you should not close any 
		 * Scanner instances because closing one will close System.in and when you do 
		 * the following, NoSuchElementException will be thrown when someone enters
		 * an incorrect login. It does not happen when a correct login is entered.
		 * The Java VM collects the garbage and no memory leak happens.
		 */
	System.out.println("Student Not Found");
	}
}