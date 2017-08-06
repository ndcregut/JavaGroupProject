package saisapp;
//Exception for StudentTranscript Exception
public class STranscriptException extends Exception{
	
	//default Constructor
	public STranscriptException(){
		super("No transcript on file");
	}
}