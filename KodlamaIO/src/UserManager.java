
public class UserManager {

	public void add(User user) {
	
		System.out.println(user.getUserName() + " Adlý kullanýcý baþarýyla eklendi!");
	}
	
	public void log(String user1,String password, User user) {
		if(!(user1 ==user.getUserName()) || !(password ==user.getPassword())) {
			System.out.println("Bilgileriniz yanlýþ lütfen tekrar giriþ yapmayý deneyin.");
		}
		else {
			System.out.println("Bilgiler doðrulandý giriþ baþarýlý.");
		}
	}
}
