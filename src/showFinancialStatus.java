import java.util.Scanner;
import java.util.ArrayList;

public class showFinancialStatus throws Exception{

	public static void main(String[] args){
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
			financialStatus = input.net();

			//use try-catch block to create Finanical Status instance
			try{
				listOfStatus.add(new FinancialStatus(studentID, accountBalance, financialStatus));
			}
			
			//prints exception
			catch(FStatusException){
			}
		}
		
		//method for searching for student's financial status based on id
	}
	
}