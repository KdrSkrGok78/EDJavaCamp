
public class Student extends User {

	//student'�n kendi field(lar)� burada
	double grade;
	
	
	public Student(int id, String userName, String password, String email, double grade) {
		super(email, userName, password, id);//super di�er parametre ve metotlar�n yan�nda eklenecek metodlar� da kulland�rt�yor
		this.grade=grade;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}

	
	
	
	
	
}
