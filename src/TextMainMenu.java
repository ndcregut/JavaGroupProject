import java.util.Scanner;

public class TextMainMenu {
	
	public static void mainMenu(StudentLogin studentLogin) throws Exception{
		int selection = 0;
		//Run option(s) as selected by user (getCurrentSchedule, viewCurrentGrades, showFinancialStatus, Exit)
		System.out.println();
		System.out.println("Select one of the following options:");
		System.out.println(" 1) Get current schedule");
		System.out.println(" 2) View Current grades");
		System.out.println(" 3) Show Financial Status");
		System.out.println(" 4) Exit");
		System.out.println("");
		//Create scanner for input
		Scanner input = new Scanner(System.in);
		//Use try-catch blocks to get selection
		try{
			selection = input.nextInt();
		}
		//prints exception
		catch(Exception ex){
			System.out.println(ex);		//default exception here, may need to give better explanation or create custom exception
			//we need to reset the student text box here.
		}
		if (selection == 1) {
			viewCurrentSchedule.readSchedules(studentLogin);
			selection = 4;
		}
		else if (selection == 2)
			selection = 4;
		else if (selection == 3)
			selection = 4;
		else if (selection == 4) {
			studentLogin.setLoggedIn(2);
			return;
		}
		else {
			System.out.println("Incorrect input, try again.");
		}	
	}
}
