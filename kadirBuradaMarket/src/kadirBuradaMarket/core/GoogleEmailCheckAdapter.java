package kadirBuradaMarket.core;

import google.account.service.GoogleEmailCheck;

public class GoogleEmailCheckAdapter implements RegisterService{

	GoogleEmailCheck google=new GoogleEmailCheck();
	
	@Override
	public void registerToSystem(String email, String password) {
		google.register(email, password);	
	}

	@Override
	public void loginToSystem(String email, String password) {
		google.login(email, password);
	}

}
