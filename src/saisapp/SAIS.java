package saisapp;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.io.*;
import saisapp.StudentLogin;

public class SAIS{
	
	//global variable for student id
	private static int glbsID;
	
	//Getter method for Global student if
	public int getGlobalID(){
		return glbsID;
	}
	
	//method for student log in
	public static int studentLogin(StudentLogin newSLong) throws StudentException{
		
		//declaring variables
		int sid = newSLong.getStudentID();
		int dob = newSLong.getDOB();
		
		//Create new ArrayList of Student Objects for login
		ArrayList<Student> list = new ArrayList<Student>();
			
		//Student variables
		int ssid;
		int sdob;
		String sFName;
		String sLName;
		char sRegStatus;

		//Create java File object to load Student text file
		java.io.File file = new java.io.File("Student.txt");
		
		//Try loading contents of Student file
		try{
			Scanner input = new Scanner(file);
			
			while(input.hasNext()){
				sFName = input.next();
				sLName=input.next();
				ssid = input.nextInt();
				sdob = input.nextInt();
				sRegStatus=input.next().charAt(0);
				
				//Try creating new Student Object
				try{
					list.add(new Student(sFName, sLName, ssid, sdob, sRegStatus));
				}
				catch(StudentException ex){
					System.out.println(ex);
				}
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		
		//Determine if login keyed in matches one of the Student objects loaded
		for(int i = 0; i < list.size(); i++){
			ssid = list.get(i).getStudentID();
			sdob = list.get(i).getDOB();
			sFName = list.get(i).getFName();
			sLName = list.get(i).getLName();
			sRegStatus = list.get(i).getRegStatus();
			
			if(sid == ssid && dob == sdob){				
	
				int curStudent= ssid;
				glbsID=ssid;
				return curStudent;
			}
		}
	
		return 0;
	}
	
	//Method for showing student's financial status
	public static ArrayList showFinancialStatus()throws FinancialException{
		
		//Create new arraylist for Financial status objects
		ArrayList<FinancialStatus> list = new ArrayList<FinancialStatus>();
		
		//Financial status variables
		int ssid;
		int sAmount;
		String sStatus;
		
		//Create java File object to load FStatus text file
		java.io.File file = new java.io.File("FStatus.txt");
		
		//Try loading contents of FStatus text file
		try{
			Scanner input = new Scanner(file);
			
			while(input.hasNext()){
					ssid = input.nextInt();
					sAmount=input.nextInt();
					sStatus=input.next();
					
					//Try creating new Financial Status object
					try{
					list.add(new FinancialStatus(ssid, sAmount,sStatus));
				}
				catch(FinancialException ex){
					System.out.println(ex);
				}
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		
		//Create new Arraylist to hold student's Financial status
		ArrayList<FinancialStatus> curStatus = new ArrayList<FinancialStatus>();
		
		//Get student's Financial Status
		for(int i = 0; i < list.size(); i++){
			ssid = list.get(i).getStudentID();
			
			if(glbsID == ssid){				
				sAmount = list.get(i).getAccountBalance();
				sStatus = list.get(i).getFinancialStatus();
				try{
					curStatus.add(new FinancialStatus(ssid, sAmount,sStatus));
				}
				catch(FinancialException ex){
					System.out.println(ex);
				}
			}
		}
	
		return curStatus;
	}

	//Method for showing student's current schedule
	public static ArrayList viewCurrentSchedule()throws ScheduleException{
		//Create new array list for Schedule objects
		ArrayList<Schedule> list = new ArrayList<Schedule>();

		// Schedule Variables
		int ssid;
		String sSemester;
		int sYear;
		String sClassID;
		String sClassName;
		String sDays;
		String sTimes;
		String sBuilding;
		String sRoom;
		
		//Create java File object to load Schedule text file
		java.io.File file = new java.io.File("Schedule.txt");
		
		//Try loading contents of Schedule text file into list 
		try{
			Scanner input = new Scanner(file);
			
			while(input.hasNext()){
					ssid = input.nextInt();
					sSemester = input.next();
					sYear = input.nextInt();
					sClassID = input.next();
					sClassName = input.next();
					sDays = input.next();
					sTimes = input.next();
					sBuilding = input.next();
					sRoom = input.next();

				//Try Creating new Schedule Object
				try{
					list.add(new Schedule(ssid, sSemester, sYear, sClassID, sClassName, sDays, sTimes, sBuilding, sRoom));
				}
				catch(ScheduleException ex){
					System.out.println(ex);
				}
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		
		//Create ArrayList to hold Student's schedule
		ArrayList<Schedule> curSchedule = new ArrayList<Schedule>();
		
		//Get student's schedule
		for(int i = 0; i < list.size(); i++){
			ssid = list.get(i).getStudentID();
			
			if(glbsID == ssid){				
				sSemester = list.get(i).getSemester();
				sYear = list.get(i).getYear();
				sClassID = list.get(i).getClassID();
				sClassName = list.get(i).getClassName();
				sDays = list.get(i).getDays();
				sTimes = list.get(i).getTimes();
				sBuilding = list.get(i).getBuilding();
				sRoom = list.get(i).getRoom();
				try{
					curSchedule.add(new Schedule(ssid, sSemester, sYear, sClassID, sClassName, sDays, sTimes, sBuilding, sRoom));
				}
				catch(ScheduleException ex){
					System.out.println(ex);
				}
			}
		}		
		return curSchedule;
	}

	//Method for showing current grades
	public static ArrayList viewCurrentGrades()throws GradeException{

		//Create new arraylist list to hold Grade Objects
		ArrayList<Grade> list = new ArrayList<Grade>();
		
		//Grade Objects
		char sGrade;
		String sClassID;
		String sClassName;
		int ssid;
		String sSemester;
		int sYear;
				
		//Create java File Object to load Grade text file
		java.io.File file = new java.io.File("Grades.txt");
		
		//Try loading contents of Grade file into list 
		try{
			Scanner input = new Scanner(file);
			
			while(input.hasNext()){
					sGrade=input.next().charAt(0);	
					sClassID = input.next();
					sClassName = input.next();
					ssid = input.nextInt();
					sSemester = input.next();
					sYear = input.nextInt();
					
				//Try creating new Grade Object
				try{
					list.add(new Grade(ssid,sClassID, sClassName,sGrade,sSemester,sYear));
				}
				catch(GradeException ex){
					System.out.println(ex);
				}
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		
		//Create new array list to hold Student's Grades
		ArrayList<Grade> curGrade = new ArrayList<Grade>();
		
		//Get Student's grades
		for(int i = 0; i < list.size(); i++){
			ssid = list.get(i).getStudentID();
			
			if(glbsID == ssid){				
				sClassID = list.get(i).getClassID();
				sClassName = list.get(i).getClassName();
				sGrade = list.get(i).getGrade();
				sSemester= list.get(i).getSemester();
				sYear = list.get(i).getYear();
				try{
					curGrade.add(new Grade(ssid, sClassID, sClassName,sGrade,sSemester,sYear));
				}
				catch(GradeException ex){
					System.out.println(ex);
				}
			}
		}		
		return curGrade;
	}
}
