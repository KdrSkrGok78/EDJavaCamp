package kadirBuradaMarket.business.concretes;

import kadirBuradaMarket.business.abstracts.UserService;
import kadirBuradaMarket.business.abstracts.ValidationService;
import kadirBuradaMarket.core.RegisterService;
import kadirBuradaMarket.dataAccess.abstracts.UserDao;
import kadirBuradaMarket.entities.concretes.User;

public class UserManager implements UserService{

	RegisterService registerService;
	UserDao userDao;
	ValidationService validationService;
	
	public UserManager(UserDao userDao, RegisterService registerService,ValidationService validationService) {
		super();
		this.userDao= userDao;
		this.registerService = registerService;
		this.validationService=validationService;
	}

	
	
	@Override
	public void register(User user) {

		if(user.getEmail().contains("@")== true && user.getPassword().length() >= 6 && !(user.getFirstName() == null)
				&& !(user.getLastName()== null)) {
			this.validationService.emailValidation(user);
			System.out.println("--------------------------------------------------------------");
			this.userDao.register(user);
		}
		
		else {
			System.out.println("Kayýt bilgilerinde eksik var lütfen doldurup tekrar deneyin.");
		}
	}

	@Override
	public void login(User user) {
	
		if(this.validationService.userCheck(user)== true) {
			this.userDao.login(user);
		}
		else {
			System.out.println("Giriþ bilgilerinde hata var kontrol edip tekrar deneyiniz.");
		}
	}



	@Override
	public void registerWithGoogle(String email, String password) {
		this.registerService.loginToSystem(email, password);
		
	}


	@Override
	public void loginWithGoogle(String email, String password) {
		this.registerService.loginToSystem(email, password);
		
	}
	

	
}
