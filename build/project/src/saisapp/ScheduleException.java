package saisapp;
//Exception for Schedule class
public class ScheduleException extends Exception{

	//default constructor
	public ScheduleException(){
		super("There is no schedule on file.");
	}
}