package schoolManagement;

public class StudentManager {
	

	public void addToLesson(Student student , Lesson lesson) {
		System.out.println(student.studentName+" adlý öðrencinin "+lesson.lessonName+" dersine kaydý tamamlandý");
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
