import kadirBuradaMarket.business.abstracts.UserService;
import kadirBuradaMarket.business.concretes.UserManager;
import kadirBuradaMarket.business.concretes.ValidationManager;
import kadirBuradaMarket.core.GoogleEmailCheckAdapter;
import kadirBuradaMarket.core.RegisterService;
import kadirBuradaMarket.dataAccess.concretes.HibernateUserDao;
import kadirBuradaMarket.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	
		User kadir = new User(1,"Kadir","Gök","kadirgok06@hotmail.com","kadir123");
		User ali = new User(1,"ali","Gök","aligok06@hotmail.com","ali12");// parola yanlýþ 
		User fatma = new User(1,"fatma","Gök","fatmagok06hotmail.com","fatma123");//@ iþareti yok 
		User zeynep = new User();
		zeynep.setFirstName("Zeynep");
		zeynep.setEmail("zeynep@gmail.com");
		zeynep.setPassword("zeynep123");
		
		
		UserService userService = new UserManager(new HibernateUserDao(),new GoogleEmailCheckAdapter(),new ValidationManager());
		userService.register(kadir);//þartlarý saðladý ve kayýt oldu.
		System.out.println("--------------------------------");
		userService.login(kadir);
		System.out.println("--------------------------------");
		userService.loginWithGoogle(zeynep.getEmail(),zeynep.getPassword());//ayrý metot olarak koydum sonuçta 1 kayýt ekraný var
		System.out.println("--------------------------------");
		userService.register(ali);//ali'nin parolasý þartý saðlamadý ve kayýt olamadý.
		userService.login(ali);//burayý validationmanager'daki true-false ile yapýyorum þimdilik veritabanýna geçince 
		//daha güzel þekilde doðrulama yazarým.
		System.out.println("--------------------------------");
		userService.register(fatma);//fatma'nýn e postasýnda @ iþaret yoktu ama eMaillerde bu olmalý sonuçta.
		
		
			
		
	
		

	}

}
