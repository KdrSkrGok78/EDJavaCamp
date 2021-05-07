import kadirBuradaMarket.business.abstracts.UserService;
import kadirBuradaMarket.business.concretes.UserManager;
import kadirBuradaMarket.business.concretes.ValidationManager;
import kadirBuradaMarket.core.GoogleEmailCheckAdapter;
import kadirBuradaMarket.core.RegisterService;
import kadirBuradaMarket.dataAccess.concretes.HibernateUserDao;
import kadirBuradaMarket.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	
		User kadir = new User(1,"Kadir","G�k","kadirgok06@hotmail.com","kadir123");
		User ali = new User(1,"ali","G�k","aligok06@hotmail.com","ali12");// parola yanl�� 
		User fatma = new User(1,"fatma","G�k","fatmagok06hotmail.com","fatma123");//@ i�areti yok 
		User zeynep = new User();
		zeynep.setFirstName("Zeynep");
		zeynep.setEmail("zeynep@gmail.com");
		zeynep.setPassword("zeynep123");
		
		
		UserService userService = new UserManager(new HibernateUserDao(),new GoogleEmailCheckAdapter(),new ValidationManager());
		userService.register(kadir);//�artlar� sa�lad� ve kay�t oldu.
		System.out.println("--------------------------------");
		userService.login(kadir);
		System.out.println("--------------------------------");
		userService.loginWithGoogle(zeynep.getEmail(),zeynep.getPassword());//ayr� metot olarak koydum sonu�ta 1 kay�t ekran� var
		System.out.println("--------------------------------");
		userService.register(ali);//ali'nin parolas� �art� sa�lamad� ve kay�t olamad�.
		userService.login(ali);//buray� validationmanager'daki true-false ile yap�yorum �imdilik veritaban�na ge�ince 
		//daha g�zel �ekilde do�rulama yazar�m.
		System.out.println("--------------------------------");
		userService.register(fatma);//fatma'n�n e postas�nda @ i�aret yoktu ama eMaillerde bu olmal� sonu�ta.
		
		
			
		
	
		

	}

}
