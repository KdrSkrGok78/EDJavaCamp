package schoolManagement;

public class Student
{
	public Student(int studentNumber,String studentName,double studentPoint) {
		this.studentName=studentName;
		this.studentNumber=studentNumber;
		this.studentPoint=studentPoint;
		System.out.println(studentName+" adlı öğrenci başarıyla eklendi");
	}

	String studentName;
	int studentNumber;
	double studentPoint;
}
