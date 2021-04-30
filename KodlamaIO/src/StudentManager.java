
public class StudentManager extends UserManager{

	public void getHomework(Instructor instructor,Student student,String homework) {
		System.out.println(instructor.getUserName()+" öðretmeninizden, size  "+homework+" ödevi gönderildi!");
	}
}
