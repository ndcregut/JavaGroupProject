package saisapp;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.io.*;
import saisapp.StudentLogin;

public class SAIS{
	
	public static int studentLogin(StudentLogin newSLong) throws StudentException{
		int sid = newSLong.getStudentID();
		int dob = newSLong.getDOB();
		
		ArrayList<Student> list = new ArrayList<Student>();
			
		int ssid;
		int sdob;
		String sFName;
		String sLName;
		char sRegStatus;
		
		java.io.File file = new java.io.File("saisapp/Student.txt");
				
		
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
	
				return curStudent;
			}
		}
	
		return 0;
	}
	
	public static void readStudentFile(ArrayList<Student> list) throws StudentException {
		String fName;
		String lName;
		int studentID;
		int DOB;
		char regStatus;
		String temp = "";
		
		Scanner input = null;
		try
		{
			input = new Scanner(new File("Student.txt"));
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
	

}
