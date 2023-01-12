package chapter08;

public class Student1Main2 {

	public static void main(String[] args) {

		Student1 studentLee = new Student1();
		studentLee.setStudentName("이재민");
		studentLee.studentID = studentLee.serialNum;
		System.out.println("이름 : " + studentLee.studentName + " | 아이디 : " + studentLee.studentID);
		Student1.serialNum++;// 10001

		Student1 studentKim = new Student1();
		studentKim.setStudentName("김창우");
		studentKim.studentID = studentKim.serialNum;
		System.out.println("이름 : " + studentKim.studentName + " | 아이디 : " + studentKim.studentID);
		Student1.serialNum++;// 10002

		Student1 studentPark = new Student1();
		studentPark.setStudentName("박창훈");
		studentPark.studentID = studentPark.serialNum;
		System.out.println("이름 : " + studentPark.studentName + " | 아이디 : " + studentPark.studentID);
		Student1.serialNum++;// 10003

	}

}
