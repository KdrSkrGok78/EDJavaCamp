
public class InstructorManager extends UserManager{

	public void sendHomework(Instructor instructor,Student student,String homework) {
		System.out.println(instructor.getUserName()+" olarak "+student.getUserName()+" adl� ��renciye "+homework+
				" �devi ba�ar�yla g�nderildi!");
		
	}
}

	



