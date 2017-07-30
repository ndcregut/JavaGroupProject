
import java.util.Scanner;
import java.util.ArrayList;

public class showFinancialStatus{

	public static void financialStatus(StudentLogin studentLogin) throws Exception{
		ArrayList<FinancialStatus> listOfStatus = new ArrayList<>();

		//Data fields for Financial Status
		int studentID;
		float accountBalance;
		String financialStatus;

		//Create new File object with FStatus.txt file
		java.io.File file = new java.io.File("FStatus.txt");

		//create scanner object for Cars.txt file
		Scanner input = new Scanner(file);

		//loop to read contents of FStatus
		while(input.hasNext()){
			studentID = input.nextInt();
			accountBalance = input.nextFloat();
			financialStatus = input.next();

			//use try-catch block to create Financial Status instance
			try{
				listOfStatus.add(new FinancialStatus(studentID, accountBalance, financialStatus));
			}
			
			//prints exception
			catch(FinancialException ex){
				System.out.println(ex);
			}
		}
		
		//method for searching for student's financial status based on id
		FinancialStatus currentFS = new FinancialStatus();
		for (int i = 0; i < listOfStatus.size(); i++) {
			currentFS = listOfStatus.get(i);
			if (studentLogin.getStudentID() == currentFS.getStudentID()) {
				System.out.println("");
				System.out.println("StudentID: " + currentFS.getStudentID());
				System.out.println("Account Balance: " + currentFS.getAccountBalance());
				System.out.println("Financial Status: " + currentFS.getFinancialStatus());
				
			}
		}

		System.out.println("");
		System.out.println("Type 0 to Exit or 1 to return to Main Menu");
		//Create scanner for input
		Scanner scanner = new Scanner(System.in);
		//Use try-catch blocks to get selection
		int selection = 0;
		try{
			selection = scanner.nextInt();
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