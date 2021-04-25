package schoolManagement;

public class StudentManager {
	

	public void addToLesson(Student student , Lesson lesson) {
		System.out.println("öðrencinin derse kaydý tamamlandý");
	}
		
		
	public void checkScholarship(Student student,Scholarship scholarship) {
			if(student.studentPoint>=scholarship.requestPoint) {
				System.out.println("Bursu almaya hak kazandýnýz");
			}
			else {
				System.out.println("Bursu almaya hak kazanamadýnýz");
			}
		
	}
}
