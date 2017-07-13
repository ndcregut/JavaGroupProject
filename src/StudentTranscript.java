
public class StudentTranscript {
	int studentID;
	String semester;
	int year;
	int classID;
	String className;
	char grade;
	
	public StudentTranscript(int studentID, String semester, int year,
			int classID, String className, char grade) {
		this.studentID = studentID;
		this.semester = semester;
		this.year = year;
		this.classID = classID;
		this.className = className;
		this.grade = grade;
	}
}
