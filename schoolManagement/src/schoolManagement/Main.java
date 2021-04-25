package schoolManagement;

public class Main {

	public static void main(String[] args) 
	{
		
		//��renci tan�mlad�k
		Student student1 = new Student(1,"Kadir ��kr�",88.76);
			
		Student student2 = new Student(2,"Zeynep Sude",75);
		
		Student student3 = new Student(3,"Fatma",49.85);
		
		//dersleri tan�mlad�m
		
		Lesson lesson1 = new Lesson();
		lesson1.lessonId=1;
		lesson1.lessonName ="Matematik";
		
		Lesson lesson2 = new Lesson();
		lesson1.lessonId=2;
		lesson1.lessonName ="T�rk�e";
		
		Lesson lesson3 = new Lesson();
		lesson1.lessonId=3;
		lesson1.lessonName ="Fizik";
		
		
		//burs tan�mlad�m
		Scholarship scholarship1 = new Scholarship(1,"KYK",65);
		
		
		//StudentManager i�indeki metodlar� �al��t�ral�m
		
		StudentManager studentManager = new StudentManager();
		studentManager.addToLesson(student1,lesson2);
		studentManager.checkScholarship(student2,scholarship1);
		
	}
	
}
		

