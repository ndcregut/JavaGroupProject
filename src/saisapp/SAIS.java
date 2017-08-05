package saisapp;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.io.*;
import saisapp.StudentLogin;

public class SAIS{
	
	private static int glbsID;
	
	public int getGlobalID(){
		return glbsID;
	}
	
	public static int studentLogin(StudentLogin newSLong) throws StudentException{
		int sid = newSLong.getStudentID();
		int dob = newSLong.getDOB();
		
		ArrayList<Student> list = new ArrayList<Student>();
			
		int ssid;
		int sdob;
		String sFName;
		String sLName;
		char sRegStatus;

		java.io.File file = new java.io.File("Student.txt");
		
		try{
			Scanner input = new Scanner(file);
			
			while(input.hasNext()){
				sFName = input.next();
				sLName=input.next();
				ssid = input.nextInt();
				sdob = input.nextInt();
				sRegStatus=input.next().charAt(0);
				
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

	public static ArrayList showFinancialStatus()throws FinancialException{
		
		ArrayList<FinancialStatus> list = new ArrayList<FinancialStatus>();
		
		int ssid;
		float sAmount;
		String sStatus;
		
		
		java.io.File file = new java.io.File("FStatus.txt");
		
		try{
			Scanner input = new Scanner(file);
			
			while(input.hasNext()){
					ssid = input.nextInt();
					sAmount=input.nextFloat();
					sStatus=input.next();
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
		
		ArrayList<FinancialStatus> curStatus = new ArrayList<FinancialStatus>();
		
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

	
	public static ArrayList viewCurrentSchedule()throws ScheduleException{
		
		ArrayList<Schedule> list = new ArrayList<Schedule>();
		
		int ssid;
		String sSemester;
		int sYear;
		String sClassID;
		String sClassName;
		String sDays;
		String sTimes;
		String sBuilding;
		String sRoom;
		
		java.io.File file = new java.io.File("Schedule.txt");
		
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
		
		ArrayList<Schedule> curSchedule = new ArrayList<Schedule>();
		
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

	public static ArrayList viewCurrentGrades()throws GradeException{
		
		ArrayList<Grade> list = new ArrayList<Grade>();
		
		char sGrade;
		String sClassID;
		String sClassName;
		int ssid;
				
		java.io.File file = new java.io.File("Grades.txt");
		
		try{
			Scanner input = new Scanner(file);
			
			while(input.hasNext()){
					sGrade=input.next().charAt(0);	
					sClassID = input.next();
					sClassName = input.next();
					ssid = input.nextInt();
					
				try{
					list.add(new Grade(ssid,sClassID, sClassName,sGrade));
				}
				catch(GradeException ex){
					System.out.println(ex);
				}
			}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		
		ArrayList<Grade> curGrade = new ArrayList<Grade>();
		
		for(int i = 0; i < list.size(); i++){
			ssid = list.get(i).getStudentID();
			
			if(glbsID == ssid){				
				sClassID = list.get(i).getClassID();
				sClassName = list.get(i).getClassName();
				sGrade = list.get(i).getGrade();
				try{
					curGrade.add(new Grade(ssid, sClassID, sClassName,sGrade));
				}
				catch(GradeException ex){
					System.out.println(ex);
				}
			}
		}		
		return curGrade;
	}
	
	/*	public static void readStudentFile(ArrayList<Student> list) throws StudentException {
		String fName;
		String lName;
		int studentID;
		int DOB;
		char regStatus;
		String temp = "";
		
		Scanner input = null;
		try
		{
			String fileName= "Student.txt";
			input = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException s)
		{
			System.out.println("File does Not Exist Please Try Again: ");
		}

		while (input.hasNext()) {
			fName = input.next();
			lName = input.next();
			studentID = Integer.parseInt(input.next());
			DOB = input.nextInt();
			temp = input.next();
			regStatus = temp.charAt(0);
			list.add(new Student(fName, lName, studentID, DOB, regStatus));
		}
	}
	
*/
}
