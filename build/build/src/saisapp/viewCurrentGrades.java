package saisapp;

import java.util.ArrayList;
import java.util.Scanner;
//This class was used as part of the testing environment (text based system)
public class viewCurrentGrades{

	public static void readGrades(StudentLogin studentLogin)throws Exception{

		//Create new arraylist for grade objects
		ArrayList<Grade> listOfGrades = new ArrayList<>();

		//data fields for Grades
		char grade;
		String classID;
		String className;
		int studentID;	//I think we may need to add this to the grade class
		String semester;
		int year;
		

		//Create new File Object for Grades.txt file
		java.io.File file = new java.io.File("Grades.txt");

		//Create Scanner object for Grades.txt file
		Scanner input = new Scanner(file);

		//Loop to read contents of Grades.txt file
		String temp = "";
		while(input.hasNext()){
			temp = input.next();
			grade = temp.charAt(0);
			classID = input.next();
			className = input.next(); 
			studentID = Integer.parseInt(input.next());
			semester =input.next();
			year = input.nextInt();
		
			//Use try-catch blocks to create Grade instance
			try{
				listOfGrades.add(new Grade(studentID, classID, className, grade,semester, year));
			}
			
			//Prints exception
			catch(GradeException ex){
				System.out.println(ex);
			}

			//Stub for search method
		}
		// find the correct schedule and print it
		Grade currentGrade = new Grade();
		for (int i = 0; i < listOfGrades.size(); i++) {
			currentGrade = listOfGrades.get(i);
			if (studentLogin.getStudentID() == currentGrade.getStudentID()) {
				System.out.println("");
				System.out.println("StudentID: " + currentGrade.getStudentID());
				System.out.println("ClassID: " + currentGrade.getClassID());
				System.out.println("ClassName: " + currentGrade.getClassName());
				System.out.println("Grade: " + currentGrade.getGrade());
				System.out.println("Semeseter: " + currentGrade.getSemester());
				System.out.println("Year: " + currentGrade.getYear());
				
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