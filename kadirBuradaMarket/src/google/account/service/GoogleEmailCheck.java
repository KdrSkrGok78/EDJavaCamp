package google.account.service;

public class GoogleEmailCheck {

	public void register(String email, String password) {
		System.out.println("Google hesab� ile kay�t ba�ar�l� : "+ email);
	}
	
	public void login(String email, String password) {
		System.out.println("Google hesab� ile giri� yap�ld� : "+email);
	}
}
