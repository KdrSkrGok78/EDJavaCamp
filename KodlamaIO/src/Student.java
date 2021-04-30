
public class Student extends User {

	//student'ýn kendi field(lar)ý burada
	double grade;
	
	
	public Student(int id, String userName, String password, String email, double grade) {
		super(email, userName, password, id);//super diðer parametre ve metotlarýn yanýnda eklenecek metodlarý da kullandýrtýyor
		this.grade=grade;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}

	
	
	
	
	
}
