
public class Instructor extends User{

	//instructor'żn kendi field(lar)ż burada
	double żnstructorPoint;
	
	
	public Instructor(int id, String userName, String password, String email, double żnstructorPoint) {
		super(email, userName, password, id);
		this.żnstructorPoint=żnstructorPoint;
	}


	public double getInstructorPoint() {
		return żnstructorPoint;
	}


	public void setInstructorPoint(double instructorPoint) {
		żnstructorPoint = instructorPoint;
	}


	

		
}

