package schoolManagement;

public class StudentManager {
	

	public void addToLesson(Student student , Lesson lesson) {
		System.out.println("öğrencinin derse kaydı tamamlandı");
	}
		
		
	public void checkScholarship(Student student,Scholarship scholarship) {
			if(student.studentPoint>=scholarship.requestPoint) {
				System.out.println("Bursu almaya hak kazandınız");
			}
			else {
				System.out.println("Bursu almaya hak kazanamadınız");
			}
		
	}
}
