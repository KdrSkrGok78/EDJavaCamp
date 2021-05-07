package kadirBuradaMarket.business.abstracts;

import kadirBuradaMarket.entities.concretes.User;

public interface UserService{
	
	void register(User user);
	void login(User user);
	void registerWithGoogle(String email,String password);
	void loginWithGoogle(String email,String password);

}
