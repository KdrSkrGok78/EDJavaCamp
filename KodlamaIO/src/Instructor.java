
public class Instructor extends User{

	//instructor'�n kendi field(lar)� burada
	double �nstructorPoint;
	
	
	public Instructor(int id, String userName, String password, String email, double �nstructorPoint) {
		super(email, userName, password, id);
		this.�nstructorPoint=�nstructorPoint;
	}


	public double getInstructorPoint() {
		return �nstructorPoint;
	}


	public void setInstructorPoint(double instructorPoint) {
		�nstructorPoint = instructorPoint;
	}


	

		
}

