package saisapp;

//Exception for Grade class
public class GradeException extends Exception{
	
	//default constructor	
	public GradeException(){
		super("There are no grades on file");
	}
}