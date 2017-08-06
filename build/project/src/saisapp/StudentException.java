package saisapp;
//Exception for Student class
public class StudentException extends Exception{

	//default constructor
	public StudentException(){
		super("There is no student on file");
	}
}