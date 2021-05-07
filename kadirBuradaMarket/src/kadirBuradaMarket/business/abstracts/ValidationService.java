package kadirBuradaMarket.business.abstracts;


import kadirBuradaMarket.entities.concretes.User;

public interface ValidationService {

	void emailValidation(User user);
	boolean userCheck(User user);
}
