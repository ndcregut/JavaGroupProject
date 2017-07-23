import java.util.ArrayList;
import java.util.Scanner;

public class SAIS{



	public static void main(String[] args) throws Excecption{
		
		//create login menu


		//Create scanner for input
		Scanner input = new Scanner(System.in);

		//Get student id from student
		System.out.println("Please enter your student ID (numbers only): ");
	
		//Use try-catch blocks to create student id
		try{
			int studentID = nextInt();
		}	
		
		//prints exception
		catch(Exception ex){
			System.out.println(ex);		//default exception here, may need to give better explanation or create custom exception
			//we need to reset the student text box here.
		}

		//Get DOB from student
		System.out.println("Please enter your DOB (mmyyyy): ");
		try{		
			Date DOB = nextDate();
		}

		//prints exception
		catch(Exception ex){
			System.out.println(ex);		//default exception here, may need to give better explanation or create custom exception
			//we need to reset the DOB text box here.
		}


		
		//Close login menu with successful login (maintain student id object)

		//Create main menu with options 

		//Run option(s) as selected by user (getCurrentSchedule, viewCurrentGrades, showFinancialStatus, Exit)
	
		
	}


	public class LoginMenu{
		//Stub
	}

	public class Menu{
		//Stub
	}
}