
public class Instructor extends User{

	//instructor'ýn kendi field(lar)ý burada
	double ýnstructorPoint;
	
	
	public Instructor(int id, String userName, String password, String email, double ýnstructorPoint) {
		super(email, userName, password, id);
		this.ýnstructorPoint=ýnstructorPoint;
	}


	public double getInstructorPoint() {
		return ýnstructorPoint;
	}


	public void setInstructorPoint(double instructorPoint) {
		ýnstructorPoint = instructorPoint;
	}


	

		
}

