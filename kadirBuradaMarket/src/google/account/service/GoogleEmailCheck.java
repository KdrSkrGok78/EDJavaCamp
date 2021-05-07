package google.account.service;

public class GoogleEmailCheck {

	public void register(String email, String password) {
		System.out.println("Google hesabý ile kayýt baþarýlý : "+ email);
	}
	
	public void login(String email, String password) {
		System.out.println("Google hesabý ile giriþ yapýldý : "+email);
	}
}
