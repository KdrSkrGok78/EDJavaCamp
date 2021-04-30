
public class Main {

	public static void main(String[] args) {
		
	
		Student kadir = new Student(1,"kadir","kadir123","kadirsukru.gok@gmail.com",4.2);
		System.out.println(kadir.getUserCode());
		System.out.println(kadir.getGrade());
		
		
		Instructor ali = new Instructor(14,"ali","ali1235564374","ali.gok@gmail.com",4.7);
		System.out.println(ali.getUserCode());
		System.out.println(ali.getPassword());//parola gözüktü get bloklarý çalýþýyor
		ali.setPassword("ali123");//parola deðiþti set bloklarý çalýþýyor
		System.out.println(ali.getPassword());//parola deðiþti 
		
		UserManager manager = new UserManager();
		manager.add(kadir);//add metodu da çalýþýyor 
		
		StudentManager studentLog = new StudentManager();
		studentLog.log("kadir1","12", kadir);//bilgilerimi yanlýþ girdim ve if ile yazdýðým çýktýyý aldým log metodum çalýþýyor
		studentLog.log("ali","ali123", ali);//bilgileri doðru girdim ve else bloðu çalýþtý log metodu sýkýntýsýz.
		studentLog.getHomework(ali, kadir, "3.hafta ödevi");//ödevimizi de alýyoruz :)
		
		InstructorManager instructorLog = new InstructorManager();
		instructorLog.sendHomework(ali, kadir, "3.hafta ödevi");//ödev de yollandý akýyor maþallah :)
		
		//dahasý da eklenebilir fakat sadece string içine yazacaklarým deðiþecekti bu yüzden bu kadar yaptým kýsa ve öz
	}
	

}
