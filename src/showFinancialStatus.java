
import java.util.Scanner;
import java.util.ArrayList;

public class showFinancialStatus{

	public static void main(String[] args)throws Exception{
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
	}
	
}