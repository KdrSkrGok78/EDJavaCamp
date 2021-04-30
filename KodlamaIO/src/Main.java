
public class Main {

	public static void main(String[] args) {
		
	
		Student kadir = new Student(1,"kadir","kadir123","kadirsukru.gok@gmail.com",4.2);
		System.out.println(kadir.getUserCode());
		System.out.println(kadir.getGrade());
		
		
		Instructor ali = new Instructor(14,"ali","ali1235564374","ali.gok@gmail.com",4.7);
		System.out.println(ali.getUserCode());
		System.out.println(ali.getPassword());//parola g�z�kt� get bloklar� �al���yor
		ali.setPassword("ali123");//parola de�i�ti set bloklar� �al���yor
		System.out.println(ali.getPassword());//parola de�i�ti 
		
		UserManager manager = new UserManager();
		manager.add(kadir);//add metodu da �al���yor 
		
		StudentManager studentLog = new StudentManager();
		studentLog.log("kadir1","12", kadir);//bilgilerimi yanl�� girdim ve if ile yazd���m ��kt�y� ald�m log metodum �al���yor
		studentLog.log("ali","ali123", ali);//bilgileri do�ru girdim ve else blo�u �al��t� log metodu s�k�nt�s�z.
		studentLog.getHomework(ali, kadir, "3.hafta �devi");//�devimizi de al�yoruz :)
		
		InstructorManager instructorLog = new InstructorManager();
		instructorLog.sendHomework(ali, kadir, "3.hafta �devi");//�dev de yolland� ak�yor ma�allah :)
		
		//dahas� da eklenebilir fakat sadece string i�ine yazacaklar�m de�i�ecekti bu y�zden bu kadar yapt�m k�sa ve �z
	}
	

}
