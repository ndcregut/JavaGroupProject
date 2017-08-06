package saisapp;
//Exception for StudentLogin class
public class SLoginException extends Exception{
	
	//default constructor
	public SLoginException(){
		super("No Login found");
	}
}