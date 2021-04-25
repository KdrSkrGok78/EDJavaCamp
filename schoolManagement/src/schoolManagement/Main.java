package schoolManagement;

public class Main {

	public static void main(String[] args) 
	{
		
		//öðrenci tanýmladýk
		Student student1 = new Student(1,"Kadir Þükrü",88.76);
			
		Student student2 = new Student(2,"Zeynep Sude",75);
		
		Student student3 = new Student(3,"Fatma",49.85);
		
		//dersleri tanýmladým
		
		Lesson lesson1 = new Lesson();
		lesson1.lessonId=1;
		lesson1.lessonName ="Matematik";
		
		Lesson lesson2 = new Lesson();
		lesson1.lessonId=2;
		lesson1.lessonName ="Türkçe";
		
		Lesson lesson3 = new Lesson();
		lesson1.lessonId=3;
		lesson1.lessonName ="Fizik";
		
		
		//burs tanýmladým
		Scholarship scholarship1 = new Scholarship(1,"KYK",65);
		
		
		//StudentManager içindeki metodlarý çalýþtýralým
		
		StudentManager studentManager = new StudentManager();
		studentManager.addToLesson(student1,lesson2);
		studentManager.checkScholarship(student2,scholarship1);
		
	}
	
}
		

