package chapter08;

public class Student2 {

	public static int serialNum = 9999;
	int studentID;
	String studentName;
	int grade;
	String address;

	public Student2() {
		serialNum++;
		this.studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		return serialNum;
	}

}
