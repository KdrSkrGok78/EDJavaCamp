
public class UserManager {

	public void add(User user) {
	
		System.out.println(user.getUserName() + " Adl� kullan�c� ba�ar�yla eklendi!");
	}
	
	public void log(String user1,String password, User user) {
		if(!(user1 ==user.getUserName()) || !(password ==user.getPassword())) {
			System.out.println("Bilgileriniz yanl�� l�tfen tekrar giri� yapmay� deneyin.");
		}
		else {
			System.out.println("Bilgiler do�ruland� giri� ba�ar�l�.");
		}
	}
}
