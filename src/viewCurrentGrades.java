
import java.util.ArrayList;
import java.util.Scanner;

public class viewCurrentGrades{

	public static void main(String[] args)throws Exception{

		//Create new arraylist for grade objects
		ArrayList<Grade> listOfGrades = new ArrayList<>();

		//data fields for Grades
		char grade;
		int classID;
		String className;
		int studentID;	//I think we may need to add this to the grade class

		//Create new File Object for Grades.txt file
		java.io.File file = new java.io.File("Grades.txt");

		//Create Scanner object for Grades.txt file
		Scanner input = new Scanner(file);

		//Loop to read contents of Grades.txt file
		while(input.hasNext()){
			grade = input.next().trim().charAt(0);
			classID = input.nextInt();
			className = input.next(); 
			studentID = input.nextInt();
		
			//Use try-catch blocks to create Grade instance
			try{
				listOfGrades.add(new Grade(grade, classID, className, studentID));
			}
			
			//Prints exception
			catch(GradeException ex){
				System.out.println(ex);
			}

			//Stub for search method
		}
	}
}